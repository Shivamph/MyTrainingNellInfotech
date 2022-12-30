package com.curd.entity;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private Laptop laptop;

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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", laptop=" + laptop + "]";
	}
	
	
	
	//this is my lenovo laptop
	 ///last werite code in my office laptop
	//test for push
	   
}
