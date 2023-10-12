package com.eduard.springboot.cruddemo.rest;

import com.eduard.springboot.cruddemo.dao.EmployeeDAO;
import com.eduard.springboot.cruddemo.entity.Employee;
import com.eduard.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    //Inject emmployee service
    public EmployeeRestController(EmployeeService newService){
        this.employeeService = newService;
    }

    @GetMapping("/employees")
    public List<Employee> findALL(){
        return this.employeeService.findAll();
    }

    //expose "/employees" and return a list of employees


}
