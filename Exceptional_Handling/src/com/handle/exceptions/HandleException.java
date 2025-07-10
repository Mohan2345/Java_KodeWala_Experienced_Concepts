package com.handle.exceptions;

public class HandleException 
{
	public static void main(String[] args)
	{
		try {
			// Array Index Out Of Bound Exception
			String cityName[] = {"Bengaluru", "Bhubaneswar","NewDelhi"};
			System.out.println(cityName[0]);
			System.out.println(cityName[1]);
			System.out.println(cityName[2]);
			System.out.println(cityName[3]);
			
			// Null Pointer Exception
			String name = null;
			System.out.println(name.length());
			
			// Arithmetic Exception
			int a = 10;
			int b = 0;
			int division = a/b;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Unable to access the index of array " + e);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("String is null " + e);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Not divisible by 0 " + e);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Database Connection closed");
		}
	}
}
