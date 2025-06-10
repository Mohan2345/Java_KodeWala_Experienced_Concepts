package com.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springweb.model.Users;
import com.springweb.service.RegisterService;

@Controller
public class RegistrationController 
{
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@RequestParam("firstName") String firstName,
												@RequestParam("lastName") String lastName,
												@RequestParam("dob") String dob,
												@RequestParam("city") String city,
												@RequestParam("mobile") String mobile
												,Model model)
	{
		Users user = new Users();
		user.setFirstname(firstName);
		user.setLastname(lastName);
		user.setDob(dob);
		user.setCity(city);
		user.setMobile(mobile);
		
		registerService.storeUser(user);
		
		model.addAttribute("firstName",firstName);
		model.addAttribute("lastName",lastName);
		model.addAttribute("mobile", mobile);
		return "success";
	}
}
