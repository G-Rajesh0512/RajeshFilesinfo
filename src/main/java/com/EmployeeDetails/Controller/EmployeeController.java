package com.EmployeeDetails.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDetails.Entity.Employee;
import com.EmployeeDetails.Service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empservices;
	
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee employee) {
		return empservices.saveEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return empservices.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empservices.getEmployeeById(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return empservices.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empservices.deleteEmployee(id);
		
	}

}
