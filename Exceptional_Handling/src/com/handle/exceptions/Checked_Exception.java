package com.handle.exceptions;

public class Checked_Exception 
{
	public static void main(String[] args) 
	{ 
		try {
			// Checked Exception so we have to handle by usnig try catch or ducking
			// Class.forName("HandleException");	
			// It will not show the error cause it loads the class location using fully qualified class name
			Class.forName("com.handle.exceptions.Checked_Exception");
			System.out.println("Checked_Exception.main()");
			int a = 10;
			int b = 0;
			//int divRes = a/b; // Un-Checked Exception
		} catch (ClassNotFoundException e) {
 			e.printStackTrace();
		} catch (ArithmeticException e) {
 			e.printStackTrace();
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}
}
