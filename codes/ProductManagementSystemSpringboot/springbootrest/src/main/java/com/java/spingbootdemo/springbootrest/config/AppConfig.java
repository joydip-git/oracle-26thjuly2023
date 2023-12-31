package com.java.spingbootdemo.springbootrest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.java.spingbootdemo.springbootrest.entities.*;
import com.java.springbootdemo.springbootrest.businesslayer.BusinessComponent;
import com.java.springbootdemo.springbootrest.businesslayer.ProductBusinessComponent;

@Configuration
@ComponentScan("com.java.spingbootdemo.springbootrest")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment environment;
	
	private final String DRIVER = "driver";
	private final String URL= "url";
	private final String USERNAME = "dbuser";
	private final String PASSWORD = "dbpassword";
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource  = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		driverManagerDataSource.setUsername(environment.getProperty(USERNAME));
		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDataSource;
	}
	
	@Bean
	BusinessComponent<Product,Integer> businessComponent() {
		return new ProductBusinessComponent();
	}
}
