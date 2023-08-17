package com.java.pmsapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.java.pmsapp")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment environment;

	private final String DRIVER = "driver";
	private final String URL = "url";
	private final String USERNAME = "dbuser";
	private final String PASSWORD = "dbpassword";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource manager = new DriverManagerDataSource();
		manager.setDriverClassName(environment.getProperty(DRIVER));
		manager.setUrl(environment.getProperty(URL));
		manager.setUsername(environment.getProperty(USERNAME));
		manager.setPassword(environment.getProperty(PASSWORD));
		return manager;
	}
}
