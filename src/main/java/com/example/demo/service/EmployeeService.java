package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee emp);
	
	public List<Employee> getAllEmployees();
	
	public Employee findEmployeeById(Long id);

}
