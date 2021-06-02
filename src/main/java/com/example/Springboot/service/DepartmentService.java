package com.example.Springboot.service;

import com.example.Springboot.entity.Department;

import java.util.List;

public interface DepartmentService {


    public Department saveDepartment(Department department);


    public List<Department> fetchDepartmentList();


    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department getDeptByName(String departmentName);
}
