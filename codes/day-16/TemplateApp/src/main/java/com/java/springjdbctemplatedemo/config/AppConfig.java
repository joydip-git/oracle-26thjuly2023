package com.java.springjdbctemplatedemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.java.springjdbctemplatedemo")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	public Environment environment;

	public AppConfig() {
		System.out.println("AppConfig instantiated");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
		managerDataSource.setDriverClassName(environment.getProperty("driver"));
		managerDataSource.setUrl(environment.getProperty("url"));
		managerDataSource.setUsername(environment.getProperty("dbuser"));
		managerDataSource.setPassword(environment.getProperty("dbpassword"));
		return managerDataSource;
	}
}
