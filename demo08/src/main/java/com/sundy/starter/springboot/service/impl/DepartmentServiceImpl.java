package com.sundy.starter.springboot.service.impl;

import com.sundy.starter.springboot.mapper.DepartmentMapper;
import com.sundy.starter.springboot.po.Department;
import com.sundy.starter.springboot.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addDepartment(Department department) {
        log.debug("记录debug日志了");
        departmentMapper.insert(department);
        return departmentMapper.insert(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentMapper.update(department);
    }

    @Override
    @Transactional(readOnly = true)
    public Department getDepartmentByDepartmentID(Long departmentID) {
        return departmentMapper.getById(departmentID);
    }

    @Override
    public boolean deleteDepartmentByDepartmentID(Long departmentID) {
        return departmentMapper.deleteById(departmentID);
    }
}
