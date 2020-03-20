package com.virtusa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.service.ShapeService;

public class CustomTest {

	public static void main(String[] args) {
		ApplicationContext t = new ClassPathXmlApplicationContext("custom-spring.xml");
		ShapeService shapeService = t.getBean("shapeService",ShapeService.class);
		shapeService.getTriangle();
	}
}
