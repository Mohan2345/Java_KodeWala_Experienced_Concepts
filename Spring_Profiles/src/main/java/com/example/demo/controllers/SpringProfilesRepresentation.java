package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProfilesRepresentation 
{
	@Value("${app.environment}")
	 String envirnoment;
	
	@GetMapping("/env")
	public String getEnvirnoment()
	{
		return "Current envirnoment: " + envirnoment;
	}
} 
