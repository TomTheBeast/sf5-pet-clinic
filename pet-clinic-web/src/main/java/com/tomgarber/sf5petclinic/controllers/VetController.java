package com.tomgarber.sf5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets/index", "/vets", "/vets/index.html"})
    public String listVets(Model model) {

        return "vets/index";
    }
}
