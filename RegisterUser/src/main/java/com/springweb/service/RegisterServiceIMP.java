package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.dao.RegisterDAO;
import com.springweb.model.Users;

@Service
public class RegisterServiceIMP implements RegisterService{

	@Autowired
	RegisterDAO registrationdao;
	
	@Override
	public void storeUser(Users user) 
	{
		registrationdao.saveUsers(user);
	}

}
