package com.mutable.string;

public class PrintUserDetails 
{
	public static void main(String[] args) 
	{
		String firstName = "Deepak";
		String lastName = "Kumar";
		String email = "deepak82800@gmail.com";
		String address = "Bengaluru";
		StringBuilder sb = new StringBuilder();
		sb.append("FirstName: " + firstName + "\n");
		sb.append("LastName: " + lastName + "\n");
		sb.append("Email: " + email + "\n");
		sb.append("Address: " + address + "\n");
		System.out.println("User Details: ");
		System.out.println("==============");
		System.out.println(sb);
	}

}
