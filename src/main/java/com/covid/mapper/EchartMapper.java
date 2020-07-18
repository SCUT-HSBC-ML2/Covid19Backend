package com.covid.mapper;

import com.covid.bean.Echart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EchartMapper {
    @Select("select * from echart")
    public List<Echart> getAll();
}
