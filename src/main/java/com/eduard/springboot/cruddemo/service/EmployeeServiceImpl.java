package com.eduard.springboot.cruddemo.service;

import com.eduard.springboot.cruddemo.dao.EmployeeDAO;
import com.eduard.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Transactional
    @Override
    public Employee findById(int theId) {
        return this.employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return this.employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        this.employeeDAO.deleteById(theId);
    }
}
