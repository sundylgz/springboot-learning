package com.sundy.starter.springboot.service;

import com.sundy.starter.springboot.po.Department;

public interface DepartmentService {

    boolean addDepartment(Department department);

    boolean updateDepartment(Department department);

    Department getDepartmentByDepartmentID(Long departmentID);

    boolean deleteDepartmentByDepartmentID(Long departmentID);

}
