package com.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartMent_By_Name {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("Kodewala", "HR"),
				new Employee("ABCD", "HR"),
				new Employee("Test", "IT")
				);
		
		Map<String, List<Employee>> filteredName = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(filteredName);
	}
}

class Employee
{
	String name;
	String dept;
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
