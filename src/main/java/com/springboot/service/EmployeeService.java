package com.springboot.service;

import com.springboot.mapper.EmployeeMapper;
import com.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeMapper {


    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Employee findById(Integer EmpId) {
        return employeeMapper.findById(EmpId);
    }

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    @Override
    public int delete(Integer id) {
        return employeeMapper.delete(id);
    }

    @Override
    public int update(Integer id) {
        return employeeMapper.update(id);
    }

    @Override
    public int add(Employee employee) {
        return employeeMapper.add(employee);
    }
}
