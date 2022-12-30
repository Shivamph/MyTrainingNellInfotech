package com.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
