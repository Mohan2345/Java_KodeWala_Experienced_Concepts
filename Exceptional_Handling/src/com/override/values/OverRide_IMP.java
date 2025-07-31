package com.override.values;

public class OverRide_IMP
{
	public static void main(String[] args) {
		int res = doActivity();
		System.out.println("OUTPUT: " + res);
	}
	/*
	 * 		here the amount is intially 100 but in try it was 100 but 
	 * 		in finally block we assigned again the value so the value as overridden and the value was 90
	 * 		========================================================================
	 * 		In some cases if we don't want to execute finally block then we have 
	 * 		to put system.exit(0) in try block.
	 */
	public static int doActivity()
	{
		int amount = 100;
		try {
			return amount;
		} catch (Exception e) {
 			e.printStackTrace();
		} finally {
			amount = 90;
			return amount;
		}
	}
}



