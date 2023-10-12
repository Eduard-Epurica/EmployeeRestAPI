package com.eduard.springboot.cruddemo.service;

import com.eduard.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
