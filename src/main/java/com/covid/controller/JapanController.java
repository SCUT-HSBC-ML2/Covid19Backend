package com.covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JapanController {

    @GetMapping("/Japan")
    public String cure(){
        return "Japan";
    }
}
