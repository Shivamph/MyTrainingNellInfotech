package com.curd.controller;

import java.util.List;
//local branch shivam and remote branch --
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.entity.Employee;
import com.curd.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmpByid/{id}")
	public Employee showEmpByid(@PathVariable("id") Integer id) {
		
		return employeeService.empGetByid(id);
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/showallemp")
	public List<Employee> getAllEmp(){
		
		return employeeService.showAllEmployee();
	}
	
	@PostMapping("/saveemp")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emplyee){
		
		Employee emp = employeeService.saveEmployee(emplyee);
		
		return ResponseEntity.ok().body(emp);
		
	}
	
	@PutMapping("/updateEmp/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id){
		
		Employee emp = employeeService.updateEmployee(employee, id);
		
		return ResponseEntity.ok().body(emp);
	}
	@DeleteMapping("/deleteEmp/{id}") 
	public void deleteEmp(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
		
	}

}
