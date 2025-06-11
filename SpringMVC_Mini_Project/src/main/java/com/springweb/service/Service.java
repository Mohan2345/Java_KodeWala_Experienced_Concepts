package com.springweb.service;

import com.springweb.model.Users;

public interface Service 
{
	Users registerUser(Users user);
	Users fetchReferenceNumber(String mobile);
	Users fetcheStatus(int id);
}
