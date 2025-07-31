package com.hascode.placing;

import java.util.HashSet;

public class HasCode_Demo 
{
	public static void main(String[] args) 
	{
		 
		String s1 = "Bangalore";
		System.out.println(s1.hashCode());
		String s2 = "Berhampur";
		System.out.println(s2.hashCode());
		String s3 = "Burnpur";
		System.out.println(s3.hashCode());
		String s4 = "Bhillai";
		System.out.println(s4.hashCode());
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add(s1);	// 103869311 --> 15
		hs.add(s2);	// 2063850792 --> 8
		hs.add(s3);	// 1903981246 --> 14
		hs.add(s4);	// 1523426539 --> 11
		
		System.out.println(hs);
		
	}
}
