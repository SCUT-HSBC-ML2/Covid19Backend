package com.covid.controller;

import com.covid.bean.Echart;
import com.covid.mapper.EchartMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EchartController {
    @Resource
    EchartMapper echartMapper;

    @GetMapping("/echart")
    public List<Echart> getAll(){
        return echartMapper.getAll();
    }
}
