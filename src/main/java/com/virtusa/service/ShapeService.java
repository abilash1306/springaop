package com.virtusa.service;

import com.virtusa.custom.aop.Loggable;
import com.virtusa.model.Circle;
import com.virtusa.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	
	private Circle circle;

	@Loggable
	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
}
