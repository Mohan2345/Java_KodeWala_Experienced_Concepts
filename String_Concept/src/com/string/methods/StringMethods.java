package com.string.methods;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s1 = "Deepak Kumar Bastia";
		
		System.out.println(s1.contains("Kumar"));
		
		char arr[] = s1.toCharArray();
		
		for(char x:arr)
		{
			System.out.print(x+", ");
		}
		System.out.println();
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.replace("a", "A"));
		System.out.println(s1.isBlank());
		
		String strArr[] = s1.split(" ");
		for(String x:strArr)
		{
			System.out.print(x+ ", ");
		}
		System.out.println();
		
		System.out.println(s1.startsWith("D",0));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
}
