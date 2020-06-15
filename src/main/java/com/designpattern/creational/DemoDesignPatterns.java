package com.designpattern.creational;

import com.designpattern.creational.builderpattern.Meals;
import com.designpattern.creational.builderpattern.Meals.MealsBuilder;
import com.designpattern.creational.factorypattern.Bike;
import com.designpattern.creational.factorypattern.Car;
import com.designpattern.creational.factorypattern.FactoryPattern;

public class DemoDesignPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Builder pattern
		Meals meal = new Meals.MealsBuilder("Non-veg").
					biryani("chicken-Biryani").
					rice("Rice-Not needed").
					sideDish("Mutton-fry").
					curd(true).sweet("Kesari").build();
			
		System.out.println(meal.toString());
		
		Car car = (Car)FactoryPattern.getInstance("car", "Swift");
		System.out.println(car.toString());
		
		Bike bike = (Bike)FactoryPattern.getInstance("bike", "Hornet");
		System.out.println(bike.toString());
		
		
		
		}
	
	
		


}
