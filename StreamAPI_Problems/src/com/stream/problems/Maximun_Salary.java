package com.stream.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Maximun_Salary {
	public static void main(String[] args) {
		List<Employees> empList = Arrays.asList(
					new Employees("Salman", "HR", 10000),
					new Employees("Hrithik", "IT", 12000),
					new Employees("Monika", "IT", 14000),
					new Employees("Imran", "HR", 25000)
				);
		 
		 Map<String, Optional<Employees>> maxSalary = empList.stream()
		  .collect(Collectors.groupingBy(Employees::getDept,
				  	Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))
				  ));
		 
		 maxSalary.forEach((deps,empOpt) -> 
		 	{
		 		 empOpt.ifPresent(
		 				 	emp -> {
		 				 		System.out.println("Department: " + emp.getDept() 
		 				 		+ " Name: " + emp.getName() + " Max Salary: " + emp.getSalary());
		 				 	});
		 	});
	}
}

class Employees
{
	String name;
	String dept;
	double salary;
	public Employees(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
