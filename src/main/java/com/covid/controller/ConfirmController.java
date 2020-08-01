package com.covid.controller;

import com.covid.bean.chart;
import com.covid.bean.confirm;
import com.covid.mapper.CovidMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.*;

@Controller
public class ConfirmController {

    @GetMapping("/map")
    public String index(){
        return "map";
    }
    @Resource
    CovidMapper covidMapper;

    @GetMapping("/confirm/{area}")
    public String getConfirm(@PathVariable("area") String area,Model model){
        Collection<confirm> confirms= covidMapper.getConfirm(area);
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
//        c.add(c.DATE,-6);
        String temp= ""+c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DAY_OF_MONTH);
        Collection<confirm> latestConfirms= covidMapper.getLatestConfirm(area,temp);
        System.out.println(temp);
//        System.out.println(latestConfirms);
        model.addAttribute("confirms",latestConfirms);
        model.addAttribute("href1","../confirm/"+area);
        model.addAttribute("href2","../death/"+area);
        model.addAttribute("href3","../cure/"+area);
        model.addAttribute("href4","../confirm/global");
        model.addAttribute("href5","../confirm/Japan");
        model.addAttribute("href6","../confirm/US");
        model.addAttribute("text1","Covid "+area+" 累计确诊人数预测数据");
        model.addAttribute("text2",""+area+" 累计确诊趋势绘制");
        model.addAttribute("active","1");
        return "confirm";

    }


}
