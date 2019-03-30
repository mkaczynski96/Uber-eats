package com.ubereats.controllers;

import com.ubereats.services.PremisesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PremisesController {

    private final PremisesService premisesService;

    public PremisesController(PremisesService premisesService) {
        this.premisesService = premisesService;
    }

    @GetMapping({"/premises","premises/index","premises/index.html"})
    public String listPremises(Model model){
        model.addAttribute("premises",premisesService.findAll());
        return "premises/index";
    }
}
