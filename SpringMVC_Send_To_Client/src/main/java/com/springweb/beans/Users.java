package com.springweb.beans;

public class Users 
{
	String fullName;
	
	String mobile;

	public Users() {
		super();
	}

	public Users(String fullName, String mobile) {
		super();
		this.fullName = fullName;
		this.mobile = mobile;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
