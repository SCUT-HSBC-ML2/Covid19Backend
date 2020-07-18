package com.covid.scheduler;

import com.covid.bean.Covid;
import com.covid.mapper.CovidMapper;
import com.covid.utils.JsoupHelper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class SchedulerTasks {

    @Resource
    CovidMapper covidMapper;

    @Resource
    JdbcTemplate jdbcTemplate;

    public String loadJson (String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    @Scheduled(fixedRate = 500000)
    public boolean Task(){
        jdbcTemplate.execute("DROP TABLE IF EXISTS covid");
        jdbcTemplate.execute("CREATE TABLE covid(" +
                "country VARCHAR(255), newConfirmed int, totalConfirmed int, newDeaths int, totalDeaths int, newRecovered int, totalRecovered int)");

        Map<String, String> nameMap = getName();

        ObjectMapper mapper = new ObjectMapper();//实例一个ObjectMapper
        try {
            Map<String,Object> map = mapper.readValue(
                    new File("C:\\Users\\92927\\IdeaProjects\\predict\\src\\main\\resources\\test.json"),
                    new TypeReference<Map<String, Object>>(){});
            List<Covid> covids = (List<Covid>) map.get("Countries");
            Covid covid = new Covid();//实例化实体对象
            for (int i=0;i<covids.size();i++){
                Map c = (Map) covids.get(i);
                //封装实体
                String name = c.get("Country").toString();
                covid.setCountry(nameMap.get(name)==null?name:nameMap.get(name));
                covid.setNewConfirmed(Integer.valueOf(c.get("NewConfirmed").toString()));
                covid.setTotalConfirmed(Integer.valueOf(c.get("TotalConfirmed").toString()));
                covid.setNewDeaths(Integer.valueOf(c.get("NewDeaths").toString()));
                covid.setTotalDeaths(Integer.valueOf(c.get("TotalDeaths").toString()));
                covid.setNewRecovered(Integer.valueOf(c.get("NewRecovered").toString()));
                covid.setTotalRecovered(Integer.valueOf(c.get("TotalRecovered").toString()));

                covidMapper.insertCovid(covid);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Map<String, String> getName(){
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("United States of America", "United States");
        mp.put("Russian Federation", "Russia");
        mp.put("Korea (South)", "Korea");
        mp.put("Iran, Islamic Republic of", "Iran");
        mp.put("Tanzania, United Republic of", "Tanzania");
        mp.put("Congo (Brazzaville)", "Dem. Rep. Congo");
        mp.put("Congo (Kinshasa)", "Congo");
        mp.put("South Sudan", "S. Sudan");
        return mp;
    }
}
