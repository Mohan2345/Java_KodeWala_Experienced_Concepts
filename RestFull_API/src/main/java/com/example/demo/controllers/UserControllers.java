package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Aadhar_User;
import com.example.demo.services.UserServiceIMP;

@RestController
@RequestMapping("/api/aadhar")
public class UserControllers 
{
	@Autowired
	UserServiceIMP serviceIMP;
	
	@PostMapping("/register")
	public ResponseEntity<Map<String, Object>> doRegister(@RequestBody Aadhar_User user)
	{
		boolean status = serviceIMP.saveUser(user);
		
		Map<String , Object> response = new HashMap<String, Object>();
		
		if(status)
		{
			response.put("message", "Successfully registered");
			response.put("status", true);
			return ResponseEntity.ok(response);
		} else
		{
			response.put("message", "You aadhar registration not suuccessfull");
			response.put("status", false);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response); 
		}
	}
}
