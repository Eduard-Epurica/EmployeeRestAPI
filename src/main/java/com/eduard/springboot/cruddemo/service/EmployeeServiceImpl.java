package com.eduard.springboot.cruddemo.service;

//import com.eduard.springboot.cruddemo.unused.EmployeeDAO;
import com.eduard.springboot.cruddemo.dao.EmployeeRepository;
import com.eduard.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository injectedEmployeeRepository) {
        this.employeeRepository = injectedEmployeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }


    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent()){
            theEmployee = result.get();
        } else{
            //no employee found
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }


    @Override
    public Employee save(Employee theEmployee) {
        return this.employeeRepository.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        this.employeeRepository.deleteById(theId);
    }
}
