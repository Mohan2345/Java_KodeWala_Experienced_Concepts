package com.handle.exceptions;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		String name = null;
		try {
			name.length();
			System.out.println("Inside Try Block we have to write the code which might give rise to Exception");
		} catch (Exception e) {
			System.out.println("Exception Catched" + e);
		} finally {
			System.out.println("This block will excute irrespective of exception occures");
		}
	}
}
