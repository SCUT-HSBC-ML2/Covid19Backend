package com.covid;

import com.covid.mapper.EchartMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CovidApplicationTests {

    @Resource
    EchartMapper echartMapper;

    @Test
    void contextLoads() {
        System.out.println(echartMapper.getAll());
    }

}
