package com.codeminio.controller;

import com.codeminio.dominio.Alternativa;
import com.codeminio.dominio.Enquete;
import com.codeminio.dtos.EnqueteDTO;
import com.codeminio.exceptions.RegraNegocioException;
import com.codeminio.service.EnqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/sistema/enquete")
public class EnqueteController {

    @Autowired
    private /*@ spec_public @*/ EnqueteService enqueteService;

    /*@ requires model != null;
    @*/
    @GetMapping
    public String index(Model model) {
        List<Enquete> enquetes = enqueteService.index();
        model.addAttribute("enquetes", enquetes);

        return "enquete/index";
    }

    /*@ requires principal != null && model != null && idEnquete > 0;
    @*/
    @GetMapping(value = "{id}")
    public String show(Principal principal, Model model, @PathVariable("id") int idEnquete) {
        try {
            String username = principal.getName();

            Enquete enquete = enqueteService.show(username, idEnquete);
            model.addAttribute("enquete", enquete);

            boolean voted = enqueteService.checkIfVoted(username, idEnquete);

            if (voted) {
                int numberOfVotes = 0;

                for (Alternativa alternativa : enquete.getAlternativas()) {
                    numberOfVotes = numberOfVotes + alternativa.getVotantes().size();
                }
                model.addAttribute("numberOfVotes", numberOfVotes);

                return "enquete/results";
            }

            return "enquete/show";
        } catch (RegraNegocioException e) {
            List<String> errors = e.getErrorList();
            model.addAttribute("errors", errors);

            return "redirect:/sistema/enquete";
        }
    }

    /*@ requires principal != null && model != null && idEnquete > 0 && alternativa.intValue() > 0;
    @*/
    @PostMapping(value = "{id}")
    public String update(Principal principal, Model model, @PathVariable("id") int idEnquete, Integer alternativa) {
        try {
            String username = principal.getName();
            enqueteService.update(username, idEnquete, alternativa);
            model.addAttribute("success", true);

            return "redirect:/sistema/enquete/{id}";
        } catch (RegraNegocioException e) {
            List<String> errors = e.getErrorList();
            model.addAttribute("errors", errors);

            return "redirect:/sistema/enquete/{id}";
        }
    }

    /*@ requires model != null;
    @*/
    @GetMapping(value = "/create")
    public String create(Model model) {
        EnqueteDTO enqueteDTO = new EnqueteDTO();
        model.addAttribute("enqueteDTO", enqueteDTO);

        return "enquete/create";
    }

    /*@ requires principal != null && model != null && enqueteDTO != null;
    @*/
    @PostMapping(value = "/create")
    public String store(Principal principal, Model model, EnqueteDTO enqueteDTO) {
        try {
            String username = principal.getName();

            enqueteService.store(username, enqueteDTO);
            model.addAttribute("success", true);

            return "redirect:create";
        } catch (RegraNegocioException e) {
            List<String> errors = e.getErrorList();
            model.addAttribute("errors", errors);

            return "enquete/create";
        }
    }

    /*@ requires model != null && enqueteDTO != null;
    @*/
    @PostMapping(value = "/create", params = {"addField"})
    public String addField(Model model, EnqueteDTO enqueteDTO) {
        enqueteDTO.setAlternativas("");
        model.addAttribute("enqueteDTO", enqueteDTO);

        return "enquete/create";
    }
}
