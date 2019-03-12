package com.springboot.mapper;

import com.springboot.entity.Performance;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PerformanceMapper {

    @Select("select * from employee where id = #{id} and time=#{time}")
    public List<Performance> findPerformanceById(Integer id,Integer time);
    @Select("select * from performance natural join staff")
    public List<Performance> findAllPerformance();

}
