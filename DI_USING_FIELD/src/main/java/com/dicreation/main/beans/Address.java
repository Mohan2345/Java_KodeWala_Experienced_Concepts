package com.dicreation.main.beans;

public class Address {
	private String firstLine;
	private String pinCode;
	private String city;
	public Address(String firstLine, String pinCode, String city) {
		super();
		this.firstLine = firstLine;
		this.pinCode = pinCode;
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstLine: " + firstLine + " PinCode: " + pinCode + " City: " + city;
	}
}
