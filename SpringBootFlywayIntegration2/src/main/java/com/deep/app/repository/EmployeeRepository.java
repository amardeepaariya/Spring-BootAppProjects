package com.deep.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.deep.app.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}