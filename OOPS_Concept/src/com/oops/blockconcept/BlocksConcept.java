package com.oops.blockconcept;

public class BlocksConcept 
{
	// SIB ==> Static Initialization Block (Belongs to class)
	// IIB ==> Instance Initialization Block (Belongs to object)
	/*
	 * Static block will execute after class loading and before main method execution
	 * It is used to write the file reading and DB connection
	 * It is used to initialize static variables
	 */
	static 
	{
		System.out.println("I am static block 1");
	}
	
	static 
	{
		System.out.println("I am static block 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		BlocksConcept bcp = new BlocksConcept();
		bcp.instanceMethod();
		System.out.println("Main method ended");
	}
	
	/*
	 * Instance block will execute while object creation
 	 * It is used to initialize instance variables
 	 * It is used to reduce code duplicay
	 */
	private void instanceMethod()
	{
		System.out.println("Instance block executed");
	}
	
	static
	{
		System.out.println("I am static block 3");
	}
}
