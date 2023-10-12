package com.eduard.springboot.cruddemo.service;

import com.eduard.springboot.cruddemo.dao.EmployeeDAO;
import com.eduard.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO injectedEmployeeDao) {
        this.employeeDAO = injectedEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }
}
