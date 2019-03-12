package com.springboot.mapper;

import com.springboot.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where Emp_Id = #{EmpId}")
    public Employee findById(Integer EmpId);

    @Select("select * from Employee")
    public List<Employee> findAll();

    @Delete("delete from employee where emp_id = #{empId}")
    public int delete(Integer empId);

    @Update("update employee set(name=#{name},gender=#{gender},tel=#{tel}) where emp_id = #{id}")
    public int update(Integer id);

    @Insert("insert into employee(department_id,name,age,gender,tel) values(#departmentId,#name,#age,#gender,#tel)")
    public int add(Employee employee);
}
