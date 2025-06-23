package com.string.problem;

public class StringConcept 
{
	public static void main(String[] args) 
	{
		String s1 = "Deepak";
		String s2 = new String("Deepak");
		// == method (Compares the references)
		System.out.println(s1 == s2);		// False
		//.equals method (Compare the string meaningfully means content of the string)
		System.out.println(s1.equals(s2));	// True
		// intern() method (Brings the copy of string from heap to SCP)
		s2 = s2.intern();
		System.out.println(s1 == s2);		// True
		System.out.println(s1.equals(s2));	// True
	}
}
