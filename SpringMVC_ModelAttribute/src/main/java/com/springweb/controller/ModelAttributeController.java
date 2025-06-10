package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springweb.beans.User;

@Controller
public class ModelAttributeController 
{
	@GetMapping("/registerAadhar")
	public String openRegisterForm()
	{
		return "registerAadhar";
	}
	
	@PostMapping("/register")
	@ResponseBody
	public String registerUser(@ModelAttribute User user)
	{
		System.out.println("First Nmae: " + user.getFirstName());
		System.out.println("Last Name: " + user.getLastName());
		System.out.println("Date Of Birth: " + user.getDob());
		System.out.println("CITY: " + user.getCity());
		System.out.println("Mobile: " + user.getMobile()) ;
		
		return " You have registered with the phone number: " + user.getMobile();
	}
}
