package com.collection.set;

public class HasCode_Demo 
{
	public static void main(String[] args) 
	{
		String s1 = "DEEPAK";
		String s2 = "KUMAR";
		String s3 = "BASTIA";
		String s4 = "BASTIA";
		// HasCode is unique identifier for each object. It's and integer value.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode()); 
	}
}
