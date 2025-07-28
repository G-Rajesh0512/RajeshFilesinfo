package com.EmployeeDetails.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String empname;
	private int empage;
	private String empcompany;
	private double empsalary;
	
	public Employee()
	{
		
	}
	public Employee(int empid, String empname, int empage, String empcompany, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.empcompany = empcompany;
		this.empsalary = empsalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
}
