package com.designpattern.creational.factorypattern;

public class FactoryPattern {
	
	/*
	 * Object is created based on the input parameter. Interface or abstract class
	 * is needed to create factory design pattern. This interface or abstract class
	 * need to extend in sub class.
	 */
	public static Vechile getInstance(String vehicle, String name) 
	{
		if(vehicle.equalsIgnoreCase("car"))
		{
			return new Car(name);
		}
		else if(vehicle.equalsIgnoreCase("bike"))
		{
			return new Bike(name);
		}
		
		return null;
	}

}
