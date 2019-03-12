package com.springboot.entity;

/**
 * 员工实体类
 */
public class Employee {
    private Integer EmpId;
    private Integer DepartmentId;//外键参考department表
    private String Name;
    private Integer Age;
    private Integer Gender;
    private String Tel;

    public Employee() {
    }

    public Employee(Integer EmpId, Integer departmentId, String name, Integer age, Integer gender, String tel) {
        this.EmpId = EmpId;
        DepartmentId = departmentId;
        Name = name;
        Age = age;
        Gender = gender;
        Tel = tel;
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer empId) {
        this.EmpId = empId;
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        DepartmentId = departmentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }
}
