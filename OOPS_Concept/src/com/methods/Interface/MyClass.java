package com.methods.Interface;

public class MyClass implements MyInterface
{
	@Override
	  public void defaultMethod() 
	  {
		System.out.println("Called from default method overridden in MyClass");
	 };
	
	  public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.defaultMethod();
		MyInterface.staticMethod();
	}
}
