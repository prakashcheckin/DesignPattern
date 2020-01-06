package com.designpattern.creational.factorypattern;

public class Car extends Vechile{

	private int wheel = 4;
	
	public Car(String name) 
	{
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel +"]";
	}
	
	
	
}
