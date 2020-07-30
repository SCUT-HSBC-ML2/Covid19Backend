package com.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeathController {

    @GetMapping("/death")
    public String death(){
        return "death";
    }
}
