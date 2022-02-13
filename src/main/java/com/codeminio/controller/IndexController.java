package com.codeminio.controller;

import com.codeminio.dominio.Aviso;
import com.codeminio.service.AvisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private  /*@ spec_public @*/ AvisoService avisoService;

    @RequestMapping("/")
    public /*@ pure @*/ String index() {
        return "index";
    }

    /*@ requires model != null;
    @*/
    @RequestMapping("/sistema/index")
    public String sistemaIndex(Model model) {

        List<Aviso> avisos = avisoService.index();

        model.addAttribute("avisos", avisos);

        return "sistema/index";
    }

    @RequestMapping("/login")
    public /*@ pure @*/ String login() {
        return "login";
    }
}
