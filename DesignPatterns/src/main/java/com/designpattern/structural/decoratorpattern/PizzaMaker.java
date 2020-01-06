package com.designpattern.structural.decoratorpattern;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza mozzarellaPizza =  new TomatoSauce(new Mozzarella(new Plainpizza()));
		
		System.out.println("mozzarellaPizza Ingredients : " + mozzarellaPizza.getDescription());
		System.out.println(" mozzarellaPizza Cost : " + mozzarellaPizza.getCost());
		
		/*
		 * Pizza basicPizza =  new TomatoSauce(new Plainpizza());
		 * System.out.println("basicPizza Ingredients : " +
		 * basicPizza.getDescription()); System.out.println(" basicPizza Cost : " +
		 * basicPizza.getCost());
		 */
	}

}
