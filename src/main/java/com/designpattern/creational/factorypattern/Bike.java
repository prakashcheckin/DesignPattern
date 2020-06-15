package com.designpattern.creational.factorypattern;

public class Bike extends Vechile{

	private int wheel = 2;
	
	public Bike(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", wheel=" + wheel +"]";
	}

}
