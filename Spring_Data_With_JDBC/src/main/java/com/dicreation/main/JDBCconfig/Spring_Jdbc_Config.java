package com.dicreation.main.JDBCconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Spring_Jdbc_Config {
	
	@Bean
	public DriverManagerDataSource createDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_data");
		ds.setUsername("root");
		ds.setPassword("Bastia@9090");
		return ds;
	}
	
	@Bean
	public JdbcTemplate createjdJdbcTemplate()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(createDataSource());
		return jt;
	}
}
