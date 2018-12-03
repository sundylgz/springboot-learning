package com.sundy.starter.springboot.controller;

import com.sundy.starter.springboot.po.Department;
import com.sundy.starter.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HelloController {

    @Autowired
    DepartmentService departmentService;

    @ResponseBody
    @GetMapping("/query")
    public Department query() {
        Department department = departmentService.getDepartmentByDepartmentID(1L);
        return department;
    }

    @ResponseBody
    @GetMapping("/add")
    public boolean add(@RequestParam("date") Date date) {
        Department department = new Department();
        department.setUserName("sundy2");
        department.setAge(12);
        department.setCreateTime(new Date());
        boolean result = departmentService.addDepartment(department);
        return result;
    }
}

