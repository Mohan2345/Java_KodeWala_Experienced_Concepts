package com.oops.encapsulation;

public class UserDetails 
{
	private String name;
	private int age;
	private String address;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		if(name.length() != 0)
		{
		this.name = name;
		}
		else
		{
			System.out.println("Enter a Proper Name");
		}
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		if(age > 0)
		{
		this.age = age;
		} else
		{
			System.out.println("Enter You Proper Age");
		}
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		if(address.length() != 0)
		{
			this.address = address;
		} else
		{
			System.out.println("Enter Proper address of user");
		}
	}
}
