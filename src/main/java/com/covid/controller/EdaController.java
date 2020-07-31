package com.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EdaController {

    @GetMapping("/eda")
    public String eda(){
        return "eda";
    }
}
