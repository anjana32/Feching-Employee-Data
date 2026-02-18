package com.project.kodnest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.kodnest.entity.Employee;
import com.project.kodnest.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	@PostMapping("/employee")
	@ResponseBody
	public Employee createEmplyee(@RequestParam int id, @RequestParam String password,@RequestParam String name, @RequestParam double salary, @RequestParam String gender, @RequestParam int age) {
		return employeeService.getEmployee(id, password,name, salary, gender,age);
	}
	

}
