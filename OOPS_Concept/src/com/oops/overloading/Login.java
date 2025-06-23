package com.oops.overloading;

public class Login
{
	public void doLogin(String email,String password)
	{
		System.out.println("Login.doLogin(String email,String password)");
	}
	
	public void doLogin(String phoneNumber,int otp)
	{
		System.out.println("Login.doLogin(String phoneNumber,int otp)");
	}
	
	public void doLogin(String aadhar)
	{
		System.out.println("Login.doLogin(String aadhar)");
	}
	
	public static void main(String[] args) 
	{
		Login login = new Login();
		login.doLogin("kw@kodewala.com", "kodewala@1234");
		login.doLogin("7656XXXXXX", 987605);
		login.doLogin("7310XXXXXXXXXXXX");
	}
}
