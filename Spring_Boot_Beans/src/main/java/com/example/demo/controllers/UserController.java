package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.UserInfo;

@RestController
public class UserController
{

	@Autowired
	UserInfo info;
	
	@GetMapping("/")
	public String getControllerPage()
	{
		return "Hello Controller page accessed";
	}
	
	@GetMapping("/register")
	public String getRegisterPage()
	{
		return "Register Page accessed : " + info.userInfoDetails();
	}
}
