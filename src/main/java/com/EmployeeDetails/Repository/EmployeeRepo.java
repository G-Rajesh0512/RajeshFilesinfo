package com.EmployeeDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeDetails.Entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}