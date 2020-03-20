package com.virtusa.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) throws RuntimeException {
		this.name = name;
		//to test @AfterThrowing advice
		//throw new RuntimeException();
	}

	public String setNameReturn(String name) {
		this.name = name;
		return name;
	}
	
	
}
