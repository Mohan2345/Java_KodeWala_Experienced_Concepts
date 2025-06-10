package com.springweb.beans;

public class User
{
	String firstName;
	
	String lastName;
	
	String dob;
	
	String city;
	
	String mobile;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String dob, String city, String mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.city = city;
		this.mobile = mobile;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
