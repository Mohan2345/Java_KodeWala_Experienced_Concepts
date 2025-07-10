package com.oops.Interface;

public interface RBI 
{
    void doPayment();
	void withDraw();
    default void printPassBook()
	{
    	System.out.println("Print the passbook");
 	}
}
