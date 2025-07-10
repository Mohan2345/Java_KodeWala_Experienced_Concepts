package com.methods.Interface;

public interface MyInterface 
{
	default void defaultMethod() 
	{
		printMessage("Called from default method");
	};
	static void staticMethod()
	{
		printMessage("called from static method");
	}
	private static void printMessage(String msg)
	{
		System.out.println(msg);
	}
}
