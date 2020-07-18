package com.covid;

import com.covid.bean.Covid;
import com.covid.mapper.CovidMapper;
import com.covid.scheduler.SchedulerTasks;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CovidApplicationTests {



    @Resource
    CovidMapper covidMapper;

    @Resource
    SchedulerTasks schedulerTasks;


    @Test
    void Test1(){
//        System.out.println(schedulerTasks.loadJson("https://api.covid19api.com/summary"));
    }

//    @Test
//    void Test2(){
//        Covid covid = new Covid();
//        covid.setCountry("aaa");
//        covid.setNewConfirmed(1);
//        covid.setTotalConfirmed(1);
//        covid.setNewDeaths(1);
//        covid.setTotalDeaths(1);
//        covid.setNewRecovered(1);
//        covid.setTotalRecovered(1);
//        covidMapper.insertCovid(covid);
//    }
//
    @Test
    void Test3(){
        schedulerTasks.Task();
    }
//
//    @Test
//    void Test4(){
//        System.out.println(covidMapper.getAll());
//    }

}
