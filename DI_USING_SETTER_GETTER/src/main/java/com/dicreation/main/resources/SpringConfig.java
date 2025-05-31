package com.dicreation.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dicreation.main.bean.Employee;
import com.dicreation.main.bean.InsuranceInfo;
import com.dicreation.main.bean.SalaryInfo;

@Configuration
public class SpringConfig {

	@Bean(name = "employee")
	public Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setName("Deepak");
		emp.setEmail("deepak@ai.com");
		emp.setSalaryInfo(createSalaryInfo());
		emp.setInsuranceInfo(createInsuranceInfo());
		return emp;
	}
	
	@Bean
	public SalaryInfo createSalaryInfo()
	{
		SalaryInfo sal = new SalaryInfo();
		sal.setBaseSal("120000");
		sal.setTotalSal("160000");
		return sal;
	}
	
	@Bean
	public InsuranceInfo createInsuranceInfo()
	{
		InsuranceInfo ins = new InsuranceInfo();
		ins.setTotalCoverage("200000");
		return ins;
	}
}
