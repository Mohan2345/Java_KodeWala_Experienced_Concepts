package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.AadharUser;
import com.example.demo.services.AadharServiceIMP;

@Controller
public class AadharRegController 
{
	@Autowired
	AadharServiceIMP serviceIMP;
	
	@GetMapping("/register")
	public String getRegisterPage()
	{
		return "register";
	}
	
	@PostMapping("/submit")
	public String registerUser(@ModelAttribute AadharUser user, Model model)
	{
		boolean result = serviceIMP.saveUser(user);
		if(result)
		{
			return "success";
		} else
		{
			return "error";
		}
	}
}
