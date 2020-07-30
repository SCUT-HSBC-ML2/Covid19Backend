package com.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AmericaController {

    @GetMapping("/America")
    public String cure(){
        return "America";
    }
}
