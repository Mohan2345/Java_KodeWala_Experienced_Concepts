package com.oops.abstractclass;

public abstract class Payment
{
	abstract void doPayment();
	abstract void withdrawMoney();
	
	void doNeft()
	{
		System.out.println("Customer is doing payment through NEFT");
	}
}

class PaymentOperation extends Payment
{
	@Override
	void doPayment() 
	{
		// TODO Auto-generated method stub
		System.out.println("Customer is doing payment");
	}
	@Override
	void withdrawMoney() 
	{
		// TODO Auto-generated method stub
		System.out.println("Customer is withdrawing money from accunt");
	}
}

class PaymentApp 
{
	public static void main(String[] args)
	{
		PaymentOperation operation = new PaymentOperation();
		operation.doPayment();
		operation.doNeft();
		operation.withdrawMoney();
	}
}
