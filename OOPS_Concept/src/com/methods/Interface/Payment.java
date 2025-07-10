package com.methods.Interface;

public class Payment implements ProcessPayment
{

	@Override
	public void sendAmount() {
		// TODO Auto-generated method stub
		System.out.println("User is sending money to another user");
	}
	
	  public static void main(String[] args) 
	  {
		Payment pm = new Payment();
		pm.withDrawAmount(345678.98);
		boolean result = ProcessPayment.validateCard("1234567887654321");	
		System.out.println("Card Valid: " + result);
	}
}
