package com.covid.controller;

import com.covid.bean.chart;
import com.covid.bean.confirm;
import com.covid.bean.death;
import com.covid.mapper.CovidMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.*;

@Controller
public class DeathController {

    @Resource
    CovidMapper covidMapper;

    @GetMapping("/death/{area}")
    public String getDeath(@PathVariable("area") String area, Model model){
        Collection<death> deaths= covidMapper.getDeath(area);
        List<chart> list = new ArrayList<>();
        String data="[";
        for (death death:deaths){
            chart chart=new chart(death);
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
        Collection<death> latestDeath= covidMapper.getLatestDeath(area,temp);
        System.out.println(temp);
//        System.out.println(latestConfirms);
        model.addAttribute("confirms",latestDeath);
        model.addAttribute("href1","../confirm/"+area);
        model.addAttribute("href2","../death/"+area);
        model.addAttribute("href3","../cure/"+area);
        model.addAttribute("href4","../death/global");
        model.addAttribute("href5","../death/Japan");
        model.addAttribute("href6","../death/US");
        model.addAttribute("text1","Covid "+area+" 累计死亡人数预测数据");
        model.addAttribute("text2",""+area+" 累计死亡趋势绘制");
        model.addAttribute("active","3");
        return "confirm";

    }
}
