package com.oops.Interface;

public class PaymentAPP
{
	public static void main(String[] args) 
	{
			UGB ugb = new UGB();
			ugb.doPayment();
			ugb.withDraw();
			ugb.printPassBook();
	}
}
