package com.oops.Interface;

public class UGB implements RBI
{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Do payment using UGB");
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("With Draw money using UGB");
	}
 
	
	public void printPassBook()
	{
    	System.out.println("Print the passbook in UGB");
 	}
}
