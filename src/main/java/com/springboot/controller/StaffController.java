package com.springboot.controller;
import com.springboot.entity.Staff;
import com.springboot.service.PerformanceService;
import com.springboot.service.StaffService;

import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class StaffController  {
    private PerformanceService performanceService;
    private StaffService staffService;
    private Staff user=new Staff();
    @Autowired
    public StaffController(StaffService staffService,PerformanceService performanceService) {
        this.staffService = staffService;
        this.performanceService=performanceService;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping(value="/index")
    public String index(HttpServletRequest request,ModelMap map,HttpSession session){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(user==null){
        user=staffService.staffLogin(username,password);}
        String str="";
        if(user!=null) {
            map.addAttribute("userLogin", user);
            str="index";
        }else {
            str="login";
        }
        map.addAttribute("table1",performanceService.findAllPerformance());
        return str;
    }
    @RequestMapping(value="/index.html")
    public String index(ModelMap map){
        map.addAttribute("table1",performanceService.findAllPerformance());
        map.addAttribute("userLogin", user);
        return "index";
    }
    @RequestMapping(value="/personal.html")
    public String personal(ModelMap map){
        map.addAttribute("table2",performanceService.findAllPerformance());
        map.addAttribute("userLogin", user);
        return "personal";
    }

}
