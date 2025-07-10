package com.oops.Interface;

public class SBI implements RBI
{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("do the payment using RBI");
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("With Draw money using RBI");
	}

}
