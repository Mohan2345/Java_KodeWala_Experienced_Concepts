package com.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springweb.model.Users;
import com.springweb.service.ServiceImpl;

@Controller
public class RegistrationController 
{
	@Autowired
	 ServiceImpl impl;
	
	@GetMapping("/registerAadhar")
	public String registerUser()
	{
		return "openRegistrationForm";
	}
	
	@GetMapping("/trackStatus")
	public String openTrackStatus()
	{
		return "openStatusform";
	}
	
	@GetMapping("/checkReference")
	public String openReferenceNumber()
	{
		return "checkReference";
	}
	
	@PostMapping("/register")
 	public String registerUser(@ModelAttribute Users user, Model model)
	{
		impl.registerUser(user);
		model.addAttribute("userInfo", user);
		model.addAttribute("Reference_Number", user.getRef_no());
		return "RegistrationSuccess";
 	}
	
	@PostMapping("/reference")
	public String referenceCheck(@ModelAttribute Users user, Model model)
	{
		Users fetchedUser = impl.fetchReferenceNumber(user.getMobile());
		model.addAttribute("Reference_Number", fetchedUser.getRef_no());
		return "referencesuccess";
	}
	 
	@PostMapping("/status")
	public String statusCheck(@ModelAttribute Users user, Model model)
	{
		Users fetchUsers = impl.fetcheStatus(user.getRef_no());
		model.addAttribute("Status", fetchUsers.getStatus());
		return "statussuccess";
	}
}
