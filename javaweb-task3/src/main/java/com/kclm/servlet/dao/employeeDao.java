package com.kclm.servlet.dao;

import com.kclm.servlet.entity.employee;

import java.util.List;

public interface employeeDao {
    //
    List<employee> findAll();
    //
    void addEmployee(employee emp);
    //
}
