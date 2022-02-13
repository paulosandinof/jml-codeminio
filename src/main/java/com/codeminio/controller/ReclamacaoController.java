package com.codeminio.controller;

import com.codeminio.dominio.Reclamacao;
import com.codeminio.exceptions.RegraNegocioException;
import com.codeminio.service.ReclamacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/sistema/reclamacao")
public class ReclamacaoController {

    @Autowired
    private /*@ spec_public @*/ ReclamacaoService reclamacaoService;

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/create")
    public String create(Model model) {

        Reclamacao reclamacao = new Reclamacao();
        model.addAttribute("reclamacao", reclamacao);

        return "morador/reclamar";
    }

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/lista")
    public String index(Model model) {

        // Lista de visitas
        List<Reclamacao> reclamacoes = reclamacaoService.index();
        model.addAttribute("reclamacoesLista", reclamacoes);

        return "funcionario/reclamacoes";
    }

    /*@ requires principal != null && model != null && reclamacao != null;
    @*/
    @PostMapping
    public String store(Principal principal, Model model, Reclamacao reclamacao) {

        try {
            String username = principal.getName();

            reclamacaoService.store(username, reclamacao);

            return "redirect:index";
        } catch (RegraNegocioException e) {

            List<String> errors = e.getErrorList();
            model.addAttribute("errors", errors);

            return "morador/reclamar";
        }
    }
}
