package com.oops.inheritance;

public class SendStoreEmails extends SendEmail
{
	public static void main(String[] args) 
	{
		SendStoreEmails sd = new SendStoreEmails();
		sd.sendEmailToUser("info@kodewala.com", "deepak@ai.com", "Check Your Store");
		System.out.println(sd.name);
	}
}


class SendEmail
{
	String name = "Deepak";
	public void sendEmailToUser(String fromEmail,String toEmail, String emailBody)
	{
		System.out.println("SendEmail.sendEmailToUser(): from " + fromEmail + " to: " + toEmail + " Body: " + emailBody );
	}
}
