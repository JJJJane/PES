package com.springboot.controller;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


//    @RequestMapping(value="/index",method=RequestMethod.GET)
//    public String index(ModelMap map) {
//        map.addAttribute("employee", employeeService.findById(2018001));
//        return "index";
//    }
    @RequestMapping("/center")
    public String center(ModelMap map) {
        map.addAttribute("name", "center");
        return "center";
    }
    @RequestMapping("/message")
    public String message(ModelMap map) {
        map.addAttribute("name", "message");
        return "message";
    }
    @RequestMapping("/personal")
    public String personal(ModelMap map) {
        map.addAttribute("name", "personal");
        return "personal";
    }



    @RequestMapping(value="/emps", method = RequestMethod.GET)
    @ResponseBody
//    @GetMapping("/emps")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


//    @RequestMapping(value="/emp/{EmpId}", method = RequestMethod.GET)
//    @ResponseBody
////    @GetMapping("/emp/{EmpId}")
//    public Employee findById(@PathVariable("EmpId") Integer EmpId) {
//        return employeeService.findById(EmpId);
//    }




    @RequestMapping(value="/emp/{EmpId}", method = RequestMethod.PUT)
    @ResponseBody
//    @PutMapping("/emp/{empid}")
    public int delete(@PathVariable("empid") Integer EmpId) {
        return employeeService.delete(EmpId);
    }

    public int update(Integer EmpId) {
        return employeeService.update(EmpId);
    }
    @Options(useGeneratedKeys = true,keyProperty = "EmpId")
    public int add(Employee employee) {
        return employeeService.add(employee);
    }
}
