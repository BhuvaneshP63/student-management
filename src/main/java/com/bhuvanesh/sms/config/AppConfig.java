package com.bhuvanesh.sms.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan(basePackages = "com.bhuvanesh.sms")
public class AppConfig {
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student");
		ds.setUsername("root");
		ds.setPassword("bhuvanesh@63");
		return ds;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbctemplate = new JdbcTemplate(dataSource);
		return jdbctemplate;
		
	}
	@Bean
	public NamedParameterJdbcTemplate namedparameterjdbcTemplate(DataSource dataSource) {
		NamedParameterJdbcTemplate namedparameterjdbctemplate = new NamedParameterJdbcTemplate(dataSource);
		return namedparameterjdbctemplate;
	}
	
}