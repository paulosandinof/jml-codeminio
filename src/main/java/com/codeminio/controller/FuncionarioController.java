package com.codeminio.controller;

import com.codeminio.dominio.Funcionario;
import com.codeminio.exceptions.RegraNegocioException;
import com.codeminio.service.impl.FuncionarioServiceImpl;
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
@RequestMapping("/sistema/funcionario")
public class FuncionarioController {

    @Autowired
    private /*@ spec_public @*/ FuncionarioServiceImpl service;

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/listar")
    public String listar(Model model) {
        List<Funcionario> funcionarios = service.listarFuncionarios();
        model.addAttribute("funcionarioLista", funcionarios);
        return "funcionario/listar";
    }

    /*@ requires funcionario != null && br != null && ra != null;
    @*/
    @PostMapping("/salvar")
    public ModelAndView cadastrar(Funcionario funcionario, BindingResult br, RedirectAttributes ra) {
        ModelAndView modelAndView = null;
        try {
            service.salvarFuncionario(funcionario);
            modelAndView = new ModelAndView(new RedirectView("index", true));
        } catch (RegraNegocioException e) {
            return modelAndView;
        }
        modelAndView = new ModelAndView(new RedirectView("/sistema/index", true));
        return modelAndView;
    }

    /*@ requires modelo != null;
    @*/
    @GetMapping(value = "/form")
    public String cadastrar(Model modelo) {
        Funcionario novoFuncionario = new Funcionario();
        modelo.addAttribute("funcionario", novoFuncionario);
        return "funcionario/cadastrar";
    }

    /*@ requires id != null;
    @*/
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Funcionario> procurar(@PathVariable(value = "id") Integer id) {

        Optional<Funcionario> Funcionario = service.procurarPorId(id);

        return new ResponseEntity<Funcionario>(Funcionario.get(), HttpStatus.OK);
    }

    /*@ requires id != null && funcionario != null;
    @*/
    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Funcionario> atualizar(@PathVariable(value = "id") Integer id,
                                                 @RequestBody Funcionario funcionario) {

        Optional<Funcionario> antigoFuncionario = service.procurarPorId(id);

        antigoFuncionario.map((m) -> {
            m.getUsuario().setEmail(funcionario.getUsuario().getEmail());
            m.getUsuario().setNome(funcionario.getUsuario().getNome());
            m.getUsuario().setSenha(funcionario.getUsuario().getSenha());
            m.getUsuario().setLogin(funcionario.getUsuario().getLogin());
            m.getUsuario().setCPF(funcionario.getUsuario().getCPF());
            m.getUsuario().setTelefone(funcionario.getUsuario().getTelefone());
            service.salvarFuncionario(m);
            return m;
        });

        return new ResponseEntity<Funcionario>(antigoFuncionario.get(), HttpStatus.OK);
    }

    /*@ requires id != null;
    @*/
    @DeleteMapping(value = "/{id}", produces = "application/text")
    public String deletar(@PathVariable("id") Integer id) {
        service.deletarPorId(id);

        return "Funcionario deletado";
    }
}
