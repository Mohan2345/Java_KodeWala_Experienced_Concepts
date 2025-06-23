package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserInfo;
import com.example.demo.repositories.AadharRepository;

@Service
public class AadharServicesIMP implements AadharServices
{

	@Autowired
	AadharRepository repository;
	
	@Override
	public void saveUser(UserInfo user) 
	{
		repository.save(user);
	}
	
}
