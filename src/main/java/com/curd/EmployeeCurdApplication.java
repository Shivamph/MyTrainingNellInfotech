package com.curd;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.curd.entity.Employee;
import com.curd.entity.Laptop;
import com.curd.repository.EmployeeRepository;
import com.curd.service.EmployeeService;

@SpringBootApplication

public class EmployeeCurdApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCurdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
//		employee.setId(101);
		employee.setName("Rahul Madane");
		employee.setPhno((long) 9876523);
		
		Laptop laptop = new Laptop();
//		laptop.setLaptopId(1);
		laptop.setLaptopName("DELL");
		
		
		
		employee.setLaptop(laptop);
		laptop.setEmployee(employee);
		
		System.out.println(employee);
		System.out.println(laptop.getLaptopName());
		employeerepository.save(employee);
		
		
	}

}
