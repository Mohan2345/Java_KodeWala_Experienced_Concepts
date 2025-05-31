package com.dicreation.main.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String name;
	@Autowired
	private Address address;
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee anme: " + name + " | Address Information: " + address;
	}
}
