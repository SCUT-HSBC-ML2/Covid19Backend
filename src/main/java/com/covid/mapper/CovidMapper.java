package com.covid.mapper;

import com.covid.bean.Covid;
import com.covid.bean.confirm;
import com.covid.bean.cure;
import com.covid.bean.death;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CovidMapper {
    @Select("select ObservationDate,Confirmed from ${area}")
    public Collection<confirm> getConfirm(@Param("area") String area);

    @Select("select ObservationDate,Confirmed from ${area} where Date(ObservationDate)>=#{date}")
    public Collection<confirm> getLatestConfirm(@Param("area") String area,@Param("date") String date);

    @Select("select ObservationDate,Recovered from ${area}")
    public Collection<cure> getCure(@Param("area") String area);

    @Select("select ObservationDate,Recovered from ${area} where Date(ObservationDate)>=#{date}")
    public Collection<cure> getLatestCure(@Param("area") String area,@Param("date") String date);

    @Select("select ObservationDate,Deaths from ${area}")
    public Collection<death> getDeath(@Param("area") String area);

    @Select("select ObservationDate,Deaths from ${area} where Date(ObservationDate)>=#{date}")
    public Collection<death> getLatestDeath(@Param("area") String area,@Param("date") String date);

    @Insert("insert into covid values(#{country}, #{newConfirmed}, #{totalConfirmed}, #{newDeaths}, #{totalDeaths}, #{newRecovered}, #{totalRecovered})")
    public int insertCovid(Covid covid);

    @Select("select * from covid")
    public List<Covid> getAll();
}


