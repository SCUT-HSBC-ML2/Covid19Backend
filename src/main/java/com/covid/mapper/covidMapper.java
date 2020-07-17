package com.covid.mapper;

import com.covid.bean.confirm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface covidMapper {
    @Select("select * from confirm")
    public Collection<confirm> getConfirm();


    @Select("select * from confirm where Date(ObservationDate)>=#{date}")
    public Collection<confirm> getLatestConfirm(@Param("date") String date);
}


