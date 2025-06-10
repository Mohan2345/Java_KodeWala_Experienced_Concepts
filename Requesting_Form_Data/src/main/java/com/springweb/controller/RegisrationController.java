package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisrationController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
 	@ResponseBody
	public String registerUser(@RequestParam("firstName") String firstName,
												@RequestParam("lastName") String lastName,
												@RequestParam("dob") String dob,
												@RequestParam("city") String city,
												@RequestParam("mobile") String mobile)
	{ 
		System.out.println("RegisrationController.registerUser()");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Date Of Birth: " + dob);
		System.out.println("CITY: " + city);
		System.out.println("Mobile: " + mobile);
		return "You have registered with name: " + firstName + " You will recieve on your registered mobile number: " + mobile;
	}
} 
