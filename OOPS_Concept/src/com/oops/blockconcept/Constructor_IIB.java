package com.oops.blockconcept;

public class Constructor_IIB
{
	{
		System.out.println("INSTANCE BLOCK EXECUTED");
	}
	
	public Constructor_IIB() 
	{
		// First Line Of Constructor is this() or super()
		// Second line of constructor is call to IIB
		System.out.println("Constructor will executed after IIB");
 	}
	
	public static void main(String[] args) 
	{
		Constructor_IIB cb1 = new Constructor_IIB();
		Constructor_IIB cb2 = new Constructor_IIB();
	}
}
