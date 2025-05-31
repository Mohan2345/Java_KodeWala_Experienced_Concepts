package com.dicreation.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dicreation.main.beans.Employee;
import com.dicreation.main.beans.SalaryInfo;

@Configuration
public class SpringConfig {

	@Bean(name = "employee")
	public Employee createEmployee()
	{
		Employee emp = new Employee("Deepak", createsalaryInfo());
		return emp;
	}
	
	@Bean
	public SalaryInfo createsalaryInfo()
	{
		SalaryInfo sal = new SalaryInfo("2000000");
		return sal;
	}
}
