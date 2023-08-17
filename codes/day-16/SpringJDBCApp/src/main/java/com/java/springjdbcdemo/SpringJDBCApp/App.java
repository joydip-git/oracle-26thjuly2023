package com.java.springjdbcdemo.SpringJDBCApp;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.springjdbcdemo.dataaccess.DataAccess;
import com.java.springjdbcdemo.entities.Sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			DataAccess dataAccess = (DataAccess) context.getBean("sampleDao");
			List<Sample> list = dataAccess.getRecords();
			for (Sample sample : list) {
				System.out.println(sample.getProducName());
			}
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
