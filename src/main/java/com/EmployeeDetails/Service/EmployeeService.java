package com.EmployeeDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeDetails.Entity.Employee;
import com.EmployeeDetails.Repository.EmployeeRepo;


@Service
public  class EmployeeService implements Serviceinterface {

	
	@Autowired
	private EmployeeRepo emprepository;

	
	@Override
	public Employee saveEmployee(Employee employee) {
		return emprepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return emprepository.findAll();
	}
	@Override
	public Employee getEmployeeById(int id) {
		return emprepository.findById(id).orElse(null);
	}
	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee existingEmployee = emprepository.findById(id).orElse(null);
		if(existingEmployee != null) {
			existingEmployee.setEmpname(employee.getEmpname());
			existingEmployee.setEmpage(employee.getEmpage());
			existingEmployee.setEmpcompany(employee.getEmpcompany());
			existingEmployee.setEmpsalary(employee.getEmpsalary());
			return emprepository.save(existingEmployee);
		}
		return null;
		}
	
	public void deleteEmployee(int id)
	{
		emprepository.deleteById(id);
	}

}
