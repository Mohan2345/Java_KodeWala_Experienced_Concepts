package com.oops.blockconcept;

public class ObjectCount 
{
	/*
	 * This is the logic applied to count viewers count in hotstar 
	 */
	static int counter = 0;
	
	{
		System.out.println("Instance block executed and object created");
		counter++;
	}
	
	public static void main(String[] args) 
	{
		ObjectCount oc1 = new ObjectCount();
		ObjectCount oc2 = new ObjectCount();
		ObjectCount oc3 = new ObjectCount();
		ObjectCount oc4 = new ObjectCount();
		
		System.out.println("Total Object Created: " + counter);
	}
}
