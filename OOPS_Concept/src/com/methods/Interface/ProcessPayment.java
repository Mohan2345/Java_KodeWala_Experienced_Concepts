package com.methods.Interface;

public interface ProcessPayment 
{
	void sendAmount();
	 
	// default method
	default void withDrawAmount(double amount)
	{
		printDetails("WithDraw Amount " + amount);
 	}
	
	// static method
	public static boolean validateCard(String cardNumber)
	{
		printDetails("CardNumber  " + cardNumber);
		return cardNumber.length() == 16;
	}
	
	// private method
	private static void printDetails(String msg)
	{
		System.out.println(msg);
	}
}
