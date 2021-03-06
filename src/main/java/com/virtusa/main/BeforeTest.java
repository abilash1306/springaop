package com.virtusa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.service.ShapeService;

public class BeforeTest {
	
	public static void main(String[] args) {
		ApplicationContext t = new ClassPathXmlApplicationContext("before-spring.xml");
		ShapeService shapeService = t.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		shapeService.getCircle().setName("Chaged");
		System.out.println(shapeService.getCircle().getName());
	}

}
