package com.eduard.springboot.cruddemo.dao;

import com.eduard.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

    //define field for entitymanager
    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> newQuery = this.entityManager.createQuery("from Employee", Employee.class);

        //execute query and get a result list
        List<Employee> employees = newQuery.getResultList();

        //return the results
        return employees;
    }
}
