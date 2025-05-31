package com.dicreation.main.beans;

public class Employee {
	private String name;
	private SalaryInfo salaryInfo;
	
	public Employee(String name, SalaryInfo salaryInfo) {
		super();
		this.name = name;
		this.salaryInfo = salaryInfo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Name: " + name + " Salary Information: " + salaryInfo;
	}
}
