package com.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}         
