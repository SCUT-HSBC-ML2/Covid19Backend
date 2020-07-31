package com.covid.controller;

import com.covid.mapper.CovidMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
@Controller
public class CovidController {
    @GetMapping("/covid")
    public String getcovid(Model model){
        return "redirect:/map";
    }
//    @GetMapping("/death")
//    public String getdeath(Model model){
//        return "redirect:/death/global";
//    }
//    @GetMapping("/cure")
//    public String getcure(Model model){
//        return "redirect:/cure/global";
//    }

}
