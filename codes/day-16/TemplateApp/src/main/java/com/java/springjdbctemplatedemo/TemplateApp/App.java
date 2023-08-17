package com.java.springjdbctemplatedemo.TemplateApp;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.springjdbctemplatedemo.config.AppConfig;
import com.java.springjdbctemplatedemo.dataaccess.DataAccess;
import com.java.springjdbctemplatedemo.entities.Sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			DataAccess dao = (DataAccess) context.getBean(DataAccess.class);

			List<Sample> list = dao.getRecords();
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
