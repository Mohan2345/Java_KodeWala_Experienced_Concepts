package com.oops.abstraction;

public class Login 
{
	
	public boolean doLogin(String userName, String pwdByUser)
	{
		String pwd = encryptPwd(pwdByUser);
		String encPwInDb =  connectDBAndgetPwd(userName);
		boolean result = matchPwd(encPwInDb, pwd);
		return result;
	}
	
	private String encryptPwd(String pwd)
	{
		return "FHKEYDKOBGMI=$";
	}
	
	private String connectDBAndgetPwd(String uid)
	{
		return "FHKEYDKOBGMI=$";
	}
	
	private boolean matchPwd(String pwdByUser, String pwdInDb)
	{
		return pwdByUser.equals(pwdInDb);
	}
}
