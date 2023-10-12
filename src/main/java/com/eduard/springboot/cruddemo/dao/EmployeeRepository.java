package com.eduard.springboot.cruddemo.dao;

import com.eduard.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //no need to write any specific code since it uses Spring Data JPA methods
}
