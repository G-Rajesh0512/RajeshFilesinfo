package com.EmployeeDetails.Service;

import java.util.List;

import com.EmployeeDetails.Entity.Employee;


public interface Serviceinterface {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(int id, Employee employee);
	void deleteEmployee(int  id);
	

}
