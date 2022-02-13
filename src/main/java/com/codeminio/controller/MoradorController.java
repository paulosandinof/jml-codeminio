package com.codeminio.controller;

import com.codeminio.dominio.Documento;
import com.codeminio.dominio.Morador;
import com.codeminio.exceptions.RegraNegocioException;
import com.codeminio.helper.UsuarioHelper;
import com.codeminio.service.DocumentoService;
import com.codeminio.service.impl.MoradorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller /* Arquitetura REST */
@RequestMapping("/sistema/morador")
public class MoradorController {

    @Autowired
    private /*@ spec_public @*/ MoradorServiceImpl service;

    @Autowired
    private /*@ spec_public @*/ UsuarioHelper usuarioHelper;

    @Autowired
    private /*@ spec_public @*/ DocumentoService documentoService;

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/listar")
    public String listar(Model model) {
        List<Morador> moradores = service.listarMoradores();
        model.addAttribute("moradorLista", moradores);
        return "morador/listar";
    }

    /*@ requires modelo != null;
    @*/
    @GetMapping(value = "/form")
    public String cadastrar(Model modelo) {
        Morador novoMorador = new Morador();
        modelo.addAttribute("morador", novoMorador);
        return "morador/cadastrar";
    }

    /*@ requires morador != null && br != null && ra != null;
    @*/
    @PostMapping("/salvar")
    public ModelAndView cadastrar(Morador morador, BindingResult br, RedirectAttributes ra) {
        ModelAndView modelAndView = null;
        try {
            service.salvarMorador(morador);
            modelAndView = new ModelAndView(new RedirectView("index", true));
        } catch (RegraNegocioException e) {
            return modelAndView;
        }
        modelAndView = new ModelAndView(new RedirectView("/sistema/index", true));
        return modelAndView;
    }

    /*@ requires id.intValue() > 0;
    @*/
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Morador> procurar(@PathVariable(value = "id") Integer id) {

        Optional<Morador> morador = service.procurarPorId(id);

        return new ResponseEntity<Morador>(morador.get(), HttpStatus.OK);
    }

    /*@ requires id.intValue() > 0 && morador != null;
    @*/
    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Morador> atualizar(@PathVariable(value = "id") Integer id, @RequestBody Morador morador) {

        Optional<Morador> antigoMorador = service.procurarPorId(id);

        return new ResponseEntity<Morador>(antigoMorador.get(), HttpStatus.OK);
    }

    /*@ requires id.intValue() > 0;
    @*/
    @DeleteMapping(value = "/{id}", produces = "application/text")
    public String deletar(@PathVariable("id") Integer id) {
        service.deletarPorId(id);

        return "Morador deletado";
    }

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/contas")
    public String contas(Model model) {
        String login = usuarioHelper.getUsuarioLogado().get().getLogin();
        Optional<Morador> morador = service.procurarPorLogin(login);
        List<Documento> contas = documentoService.listarContasPorMorador(morador.get().getId());
        model.addAttribute("contas", contas);
        return "morador/contas";
    }
}
