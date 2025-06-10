package com.springweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springweb.model.Users;

@Repository
public class RegisterDAOIMP implements RegisterDAO
{

	@Autowired
	DataSource dataSource;
	
	@Override
	public void saveUsers(Users user) 
	{
		 try {
			Connection con = dataSource.getConnection();
			String sql = "insert into register(firstname,lastname,dob,city,mobile) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getDob());
			ps.setString(4, user.getCity());
			ps.setString(5, user.getMobile());
			
			ps.executeUpdate();
			
			con.close();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}  
	}
}
