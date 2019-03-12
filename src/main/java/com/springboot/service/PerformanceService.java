package com.springboot.service;
import com.springboot.mapper.PerformanceMapper;
import com.springboot.entity.Performance;
import com.springboot.mapper.PerformanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerformanceService implements PerformanceMapper {

    private PerformanceMapper performanceMapper;
    @Autowired
    public PerformanceService(PerformanceMapper performanceMapper) {
        this.performanceMapper = performanceMapper;
    }

    @Override
    public List<Performance> findPerformanceById(Integer id, Integer time) {
        return performanceMapper.findPerformanceById(id,time);
    }
    @Override
    public List<Performance> findAllPerformance(){return performanceMapper.findAllPerformance();}
}
