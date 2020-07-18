package com.covid.controller;

import com.covid.bean.Covid;
import com.covid.bean.Echart;
import com.covid.mapper.CovidMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EchartController {
    @Resource
    CovidMapper covidMapper;

    @GetMapping("/echart/totalConfirmed")
    public List<Echart> getAll(){
        List<Covid> all = covidMapper.getAll();
        List<Echart> res = new ArrayList<Echart>();
        for (Covid c : all){
            Echart e = new Echart();
            e.setName(c.getCountry());
            e.setValue(c.getTotalConfirmed());
            res.add(e);
        }
        return res;
    }
}
