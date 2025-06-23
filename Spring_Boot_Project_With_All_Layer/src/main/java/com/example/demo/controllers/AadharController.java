package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.UserInfo;
import com.example.demo.services.AadharServices;

@Controller
public class AadharController 
{
	@Autowired
	AadharServices services;
	
	@GetMapping("/")
	public String getRegistrationPage()
	{
		return "register";
	}
	
	@PostMapping("/submit")
	public String doRegister(@ModelAttribute UserInfo user,Model model)
	{
		services.saveUser(user);
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("phoneNumber", user.getPhone());
		return "success";
	}
}
