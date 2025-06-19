package com.example.demo.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.beans.UserInfo;

@Controller
public class UserControllers
{
	@Autowired
	UserInfo info;
	
	@GetMapping("/")
	public String getRegistrationPage(Model model)
	{
		model.addAttribute("AAdharInfo",info);
		return "registration";
	}
	
	@PostMapping("/submit")
	public String getSuccessPage(@ModelAttribute UserInfo userInfo, Model model)
	{
		String firstName =  userInfo.getFirstName();
		String lastName = userInfo.getLastName();
		 String phone = userInfo.getPhone();
		
		System.out.println(firstName + " | " + lastName + " | " + phone);
		
		String ref_No = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName",lastName);
		model.addAttribute("phone", phone);
		model.addAttribute("ref_no", ref_No);
		return "success";
	}
}
