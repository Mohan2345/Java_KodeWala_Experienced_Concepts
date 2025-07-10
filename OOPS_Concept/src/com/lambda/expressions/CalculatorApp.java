package com.lambda.expressions;

public class CalculatorApp
{
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) ->
		{
			System.out.println("Sum is: " + (x+y));
		};
		calculator.add(20, 40);
	}
}
