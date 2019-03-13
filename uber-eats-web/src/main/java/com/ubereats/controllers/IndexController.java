package com.ubereats.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index", "/index.html"})
    public String homePage(){

        return "index";
    }

}
