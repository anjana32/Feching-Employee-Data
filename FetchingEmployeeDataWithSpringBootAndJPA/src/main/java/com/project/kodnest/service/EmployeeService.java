package com.project.kodnest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.kodnest.entity.Employee;
import com.project.kodnest.repository.EmployeeRepository;




@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepo;


	public Employee getEmployee(int id, String password, String name, double salary, String gender, int age) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(id, password, name, salary,gender,age);
		return employeeRepo.save(emp);
	}
	
	

}
