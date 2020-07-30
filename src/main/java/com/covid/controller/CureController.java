package com.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CureController {

    @GetMapping("/cure")
    public String cure(){
        return "cure";
    }
}
