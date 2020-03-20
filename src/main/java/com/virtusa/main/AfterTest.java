package com.virtusa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.service.ShapeService;

public class AfterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext t = new ClassPathXmlApplicationContext("after-spring.xml");
		ShapeService s = t.getBean("shapeService",ShapeService.class);
		s.getCircle().setNameReturn("After eturn example");
		
		s.getCircle().setName("Change");
		

	}

}
