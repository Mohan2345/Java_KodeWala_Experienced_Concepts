package com.oops.overriddingrules;

public class PaymentApp 
{
	public static void main(String[] args) 
	{
		Payment pm = new Payment();
		pm.processPayment();
		pm.paymentSuccess();
		
		Gpay gp = new Gpay();
		gp.processPayment();
		gp.paymentSuccess();
	}
}
