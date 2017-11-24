package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public EmployeeService getEmpService() {
		return empService;
	}

	public void setEmpService(EmployeeService empService) {
		this.empService = empService;
	}

	@RequestMapping("/")
	public String CreateEmpoloyee(@RequestBody  Employee emp) {
	  empService.createEmployee(emp);
	  return "Employee created succesfully   " + emp.getId(); 
	}
	
	@RequestMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
	  return empService.getAllEmployees();
	}
	
	@RequestMapping("/getEmplyeeById")
	public Employee getEmployeeById(@RequestParam ("id") Long id) {
		return empService.findEmployeeById(id);
	}
	

}
