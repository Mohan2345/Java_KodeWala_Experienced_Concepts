package com.dicreation.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dicreation.main.beans.Address;
import com.dicreation.main.beans.Employee;

@Configuration
public class SpringConfig {

	@Bean(name = "employee")
	public Employee createEmployee()
	{
		Employee emp = new Employee("Deepak");
		return emp;
	}
	
	@Bean
	public Address createAddress()
	{
		Address address = new Address("27th Main", "560068", "Bengaluru");
		return address;
	}
}
