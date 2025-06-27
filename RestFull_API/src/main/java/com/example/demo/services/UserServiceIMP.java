package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Aadhar_User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceIMP implements UserService
{
	
	@Autowired
	UserRepository repository;

	@Override
	public boolean saveUser(Aadhar_User user) 
	{
		// TODO Auto-generated method stub
		 repository.save(user);
		 if(user != null)
		 {
			 return true;
		 }
		 return false; 
	}

}
