package com.string.problem;

public class EqualsMethod 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Deepak");
		Person p2 = new Person("Deepak");
		// Apart from String both == and .equals compare the address of the object
		// It compares the 2 object's location/ references
		System.out.println(p1.equals(p2));	 //False
	}
}

class Person
{
	private String name;

	public Person(String name) {
 		this.name = name;
	}
}