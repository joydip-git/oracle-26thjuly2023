package com.java.spingdemo.SpringApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		/*
		 * Person person = new Person(); person.setId(1); person.setName("anil");
		 * person.setSalary(12000);
		 */

		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * BeanFactory factory = new XmlBeanFactory(resource); Person person = (Person)
		 * factory.getBean("personBean"); System.out.println(person.getId() + " " +
		 * person.getName() + " " + person.getSalary() + " " +
		 * person.getAddress().getCity());
		 * 
		 * Person sunilPerson = (Person) factory.getBean("sunilBean");
		 * System.out.println(sunilPerson.getId() + " " + sunilPerson.getName() + " " +
		 * sunilPerson.getSalary() + " " + sunilPerson.getAddress().getCity());
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("personBean");
		System.out.println(person.getId() + " " + person.getName() + " " + person.getSalary() + " "
				+ person.getAddress().getCity());

		BusinessComponent bo = (BusinessComponent) context.getBean("boBean");
		System.out.println(bo.fetchData());
	}
}
