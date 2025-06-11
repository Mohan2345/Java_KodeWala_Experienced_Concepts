package com.springweb.DAO;

import com.springweb.model.Users;

public interface DAOLayer 
{
	void saveUser(Users user);
	Users fetchRef(String mobile);
	Users fetchStatus(int id);
}
