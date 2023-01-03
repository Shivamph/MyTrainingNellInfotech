package com.curd;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.curd.entity.Employee;
import com.curd.entity.Laptop;
import com.curd.repository.EmployeeRepository;
import com.curd.repository.LaptopRepository;
import com.curd.service.EmployeeService;

@SpringBootApplication

public class EmployeeCurdApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeerepository;
	

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCurdApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		Laptop laptop = new Laptop();
//		
////		employee.setId(101);
//		employee.setName("Ashish Madane");
//		employee.setPhno((long) 00000);
//		
//		
////		laptop.setLaptopId(1);
//		laptop.setLaptopName("Hidustan Laptop");
//		laptop.setEmployee(employee);
//		employee.setLaptop(laptop);
//		
//		
//		
//		
//		System.out.println(employee);
//		System.out.println(laptop.getLaptopName());
//		employeerepository.save(employee);
//		
//		
		
		
	}

}
