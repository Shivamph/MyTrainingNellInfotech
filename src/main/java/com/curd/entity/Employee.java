package com.curd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity           
@Table(name="employee")
@Data
public class Employee {
	@Id
	@GeneratedValue   
	private Integer id;          
	private String name;
	private Long phno;
	public Integer getId() {
		return id; 
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public Employee(Integer id, String name, Long phno) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
	}
	public Employee() {
		super();
		//System.out.println("employee constructor");
	}
	

}
