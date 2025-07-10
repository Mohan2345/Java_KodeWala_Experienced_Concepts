package com.lambda.expressions;

public class Payment 
{
	public static void main(String[] args) {
		IBanking banking = () ->
		{
			System.out.println("Functional Interface called inside main method");
		};
		banking.pay();
	}
}
