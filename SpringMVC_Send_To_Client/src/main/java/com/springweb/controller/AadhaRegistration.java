package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springweb.beans.Users;

@Controller
public class AadhaRegistration 
{
	@GetMapping("/registerAadhar")
	public String openForm()
	{
		return "showRegistrationForm";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute Users user, Model model)
	{
		System.out.println(user.getFullName());
		System.out.println(user.getMobile());
		
		model.addAttribute("userInfo", user);
		return "displaySuccessPage";
	}
}
