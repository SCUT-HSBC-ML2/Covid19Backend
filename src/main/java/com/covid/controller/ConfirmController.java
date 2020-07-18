package com.covid.controller;

import com.covid.bean.chart;
import com.covid.bean.confirm;
import com.covid.mapper.CovidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.*;

@Controller
public class ConfirmController {
    @Resource
    CovidMapper covidMapper;

    @GetMapping("covid/confirm")
    public String getConfirm(Model model){
        Collection<confirm> confirms= covidMapper.getConfirm();
        List<chart> list = new ArrayList<>();
        String data="[";
        for (confirm confirm:confirms){
            chart chart=new chart(confirm);
            data=data+"{x:new Date("+chart.getYear()+","+chart.getMouth()+","+chart.getDay()+"),y:"+chart.getY()+"},";
        }
        data=data.substring(0,data.length() - 1);
        data=data+"]";
        model.addAttribute("data",data);
//        System.out.println(data);
        Date date = new Date();
        Calendar c= Calendar.getInstance();

        c.setTime(date);
        c.add(c.DATE,-6);
        String temp= ""+c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH);
        Collection<confirm> latestConfirms= covidMapper.getLatestConfirm(temp);
        System.out.println(temp);
//        System.out.println(latestConfirms);
        model.addAttribute("confirms",latestConfirms);
        return "confirm";

    }

}
