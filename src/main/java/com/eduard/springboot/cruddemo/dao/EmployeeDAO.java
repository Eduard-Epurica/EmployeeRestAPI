package com.eduard.springboot.cruddemo.dao;

import com.eduard.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
