package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.DAO.DAOimplementation;
import com.springweb.model.Users;

@Service
public class ServiceImpl implements com.springweb.service.Service
{

	@Autowired
	DAOimplementation daOimplementation;
	
	@Override
	public Users registerUser(Users user) 
	{
		// TODO Auto-generated method stub
		daOimplementation.saveUser(user);
		return user;
	}

	@Override
	public Users fetchReferenceNumber(String mobile) 
	{
		// TODO Auto-generated method stub
		return daOimplementation.fetchRef(mobile); 
	}

	@Override
	public Users fetcheStatus(int id) {
		// TODO Auto-generated method stub
		 return daOimplementation.fetchStatus(id);
	}

}
