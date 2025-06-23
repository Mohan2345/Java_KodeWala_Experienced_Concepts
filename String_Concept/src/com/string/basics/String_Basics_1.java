package com.string.basics;
// By Default the JVM import the java.lang.*; package so we don't need to write Manually
//  so String class is also there inside that package so String class doesn't get compile time error

public class String_Basics_1 {
	public static void main(String[] args) {
		String s1 = "KODEWALA";
		String s2 = "KODEWALA";
		System.out.println(s1 == s2);	 // True
		System.out.println(s1.equals(s2));	// True
		
		String s3 = "Kodewala";
		String s4 = "Kodewala Academy";
		System.out.println(s3 == s4);	// False
		System.out.println(s3.equals(s4));	// False
		
		String s5 = new String("Bangalore");
		String s6 = "Bangalore";
		System.out.println(s5 == s6);	// False
		System.out.println(s5.equals(s6));		// True
		
		String s7 = new String("Bangalore");
		String s8 = new String("Bangalore");
		System.out.println(s7 == s8);	// False 
		System.out.println(s7.equals(s8));	//True
	}
}
