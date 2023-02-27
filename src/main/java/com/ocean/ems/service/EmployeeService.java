package com.ocean.ems.service;

import java.util.List;

import com.ocean.ems.model.Employee;

/**
 * @author Sagar.Mohanty
 * Feb 27, 2023
 * 11:13:52 AM
 */
public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(long id, Employee employee);
	void deleteEmployee(long id);

}
