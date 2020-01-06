package com.designpattern.structural.decoratorpattern;

public class Plainpizza implements Pizza{
	
	public Plainpizza() 
	{
		System.out.println("Plain Pizza contructor called");
	}

	public String getDescription() {
		
		return "Plain Pizza";
	}

	public double getCost() {
		
		return 4.00;
	}

	
}
