package com.oops.overriddingrules;

public class Gpay extends Payment
{
	// Co-variant Type
	@Override
	public SavingAccount processPayment()
	{
		  SavingAccount svgacc = new SavingAccount();
		  System.out.println("Here money debited from SavingAccount");
		  return svgacc;
	}
	
	
	// Visibility of access modifier
	// here the visibility is increased from default to protected
	@Override
	protected void paymentSuccess()
	{
		System.out.println("Payment successfull using Gpay");
	}
}
