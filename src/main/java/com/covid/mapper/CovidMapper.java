package com.covid.mapper;

import com.covid.bean.Covid;
import com.covid.bean.confirm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CovidMapper {
    @Select("select * from confirm")
    public Collection<confirm> getConfirm();

    @Select("select * from confirm where Date(ObservationDate)>=#{date}")
    public Collection<confirm> getLatestConfirm(@Param("date") String date);

    @Insert("insert into covid values(#{country}, #{newConfirmed}, #{totalConfirmed}, #{newDeaths}, #{totalDeaths}, #{newRecovered}, #{totalRecovered})")
    public int insertCovid(Covid covid);

    @Select("select * from covid")
    public List<Covid> getAll();
}


