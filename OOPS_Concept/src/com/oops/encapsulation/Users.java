package com.oops.encapsulation;

public class Users 
{
	public static void main(String[] args) 
	{
		UserDetails details = new UserDetails();
 		 details.setName("Deepak Kumar");
 		 details.setAge(24);
 		 details.setAddress("Bengaluru");
 		 System.out.println(details.getAge());
 		 System.out.println(details.getName());
 		 System.out.println(details.getAddress());
	}
}
