package com.oops.overriddingrules;

public class Payment
{
	// Co-variant Type
	public Account processPayment()
	{
		 Account acc = new Account();
		  System.out.println("Here money debited from Account");
		 return acc;
	}
	
	// Visibility of access modifier
	// Here the visibility is default
	void paymentSuccess()
	{
		System.out.println("Payment successfull using payment method");
	}
}
