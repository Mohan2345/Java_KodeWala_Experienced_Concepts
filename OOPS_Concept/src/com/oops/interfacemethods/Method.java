package com.oops.interfacemethods;

public interface Method 
{
	void defaultMethod();
	static void staticMethod()
	{
		System.out.println("Hello From static method");
		Method.staticMethod();
	}
	 private void privateMethod()
	 {
		 System.out.println("hello from private method");
	 } 
}
