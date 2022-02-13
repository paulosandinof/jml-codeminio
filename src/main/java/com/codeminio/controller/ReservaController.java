package com.codeminio.controller;

import com.codeminio.dominio.Reserva;
import com.codeminio.exceptions.RegraNegocioException;
import com.codeminio.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/sistema/reserva")
public class ReservaController {

    @Autowired
    private /*@ spec_public @*/ ReservaService reservaService;

    /*@ requires model != null;
    @*/
    @GetMapping
    public String index(Model model) {
        List<Reserva> reservas = reservaService.index();

        model.addAttribute("reservas", reservas);

        return "reserva/index";
    }

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/create")
    public String create(Model model) {
        Reserva reserva = new Reserva();
        model.addAttribute("reserva", reserva);

        return "reserva/create";
    }

    /*@ requires principal != null && model != null && reserva != null;
    @*/
    @PostMapping
    public String store(Principal principal, Model model, Reserva reserva) {
        try {
            String username = principal.getName();

            reservaService.store(username, reserva);

            return "redirect:reserva/create";
        } catch (RegraNegocioException e) {
            List<String> errors = e.getErrorList();
            model.addAttribute("errors", errors);

            return "reserva/create";
        }
    }
}
