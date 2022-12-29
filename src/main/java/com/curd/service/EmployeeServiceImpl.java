package com.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.entity.Employee;
import com.curd.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public List<Employee> showAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee deleteemployee = employeeRepository.getById(id);
		employeeRepository.delete(deleteemployee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee emp= employeeRepository.getById(id);
		emp.setName(employee.getName());
		emp.setPhno(employee.getPhno());
		
		return employeeRepository.save(emp);
	}

	@Override
	public Employee empGetByid(Integer id) {
		
		return employeeRepository.getById(id);
	}

}
