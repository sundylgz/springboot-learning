package com.sundy.starter.springboot.mapper;

import com.sundy.starter.springboot.po.Department;

import java.util.Map;

public interface DepartmentMapper {

    boolean insert(Department department);

    boolean deleteById(Long id);

    boolean update(Department department);

    boolean updateByMap(Map<String, Object> map);

    Department getById(Long id);
}