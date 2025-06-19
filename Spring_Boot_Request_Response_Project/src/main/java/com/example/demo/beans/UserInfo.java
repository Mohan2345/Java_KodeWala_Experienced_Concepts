package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class UserInfo 
{
	String firstName;
	
	String lastName;
	
	String phone;

	
	public UserInfo() {
		super();
	}

	public UserInfo(String firstName, String lastName, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
