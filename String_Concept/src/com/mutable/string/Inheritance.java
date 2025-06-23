package com.mutable.string;

class Parent 
{
	public Parent()
	{
		System.out.println("Parent calleed");
	}
}

class Child extends Parent
{
	public Child()
	{
		System.out.println("Child was called");
	}
}

public class Inheritance
{
	public static void main(String[] args) 
	{
		Child c = new Child();
	}
}

