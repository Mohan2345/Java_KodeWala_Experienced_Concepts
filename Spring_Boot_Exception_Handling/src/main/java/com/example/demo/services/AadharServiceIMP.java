package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.entities.AadharUser;
import com.example.demo.exceptions.AadharUserClassExceptions;
import com.example.demo.repositories.AadharRepository;

@Service
public class AadharServiceIMP implements AadharRegService
{
	@Autowired
	AadharRepository repository;
	
	@Override
	public boolean saveUser(AadharUser user) 
	{
		String firstName =  user.getFirstName();
		String lastName = user.getLastName();
		String phone =  user.getPhone();
		
		if(firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty())
		{
			throw new AadharUserClassExceptions("Fill all the fields");
		}
		
		AadharUser returnUser = repository.save(user);
		
		if(returnUser != null)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
