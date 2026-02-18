package com.project.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.kodnest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
