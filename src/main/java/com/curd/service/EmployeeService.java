package com.curd.service;

import java.util.List;

import com.curd.entity.Employee;

public interface EmployeeService {
	
	List<Employee> showAllEmployee();
	
	Employee empGetByid(Integer id);
	Employee saveEmployee(Employee employee);
	
	void deleteEmployee(Integer id);
	
	Employee updateEmployee(Employee employee,Integer id);

}
