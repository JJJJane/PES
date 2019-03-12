package com.springboot.entity;

/**
 * 部门实体类
 */
public class Department {
    private Integer DepartmentId;
    private String DepartmentName;

    public Department(Integer departmentId, String departmentName) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
    }

    public Department() {
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
