package com.oops.overriddingrules;

public class SavingAccount extends Account
{
	@Override
	public void doPayment()
	{
		System.out.println("Do the payment using SavingsAccount");
	}
}
