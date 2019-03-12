package com.springboot.controller;
import com.springboot.entity.Employee;
import com.springboot.entity.Performance;
import com.springboot.service.EmployeeService;
import com.springboot.service.PerformanceService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class PerformanceController {
    private PerformanceService performanceService;

    @Autowired
    public PerformanceController(PerformanceService performanceService) {
        this.performanceService = performanceService;
    }

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String index(ModelMap map){

        map.addAttribute("table1",performanceService.findAllPerformance());
        return "index";
    }
    @RequestMapping(value="/index/{id}",method=RequestMethod.GET)
    public String personal(@PathVariable("id") Integer id,ModelMap map,@PathVariable("time") Integer time){
        map.addAttribute("table2",performanceService.findPerformanceById(id,time));
        return "personal";
    }
}
