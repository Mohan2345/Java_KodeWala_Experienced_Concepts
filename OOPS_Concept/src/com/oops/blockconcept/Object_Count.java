package com.oops.blockconcept;

public class Object_Count 
{
	static int counter = 0;
	{
		counter = counter + 1;
	}
	
	public Object_Count()
	{
		System.out.println("Constructor called");	
	}
	
	public static void main(String[] args)
	{
		 Object_Count oc = new Object_Count();
		 oc = new Object_Count();
		System.out.println("Object created: " + counter);
	}
}
