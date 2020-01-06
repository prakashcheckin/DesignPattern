package com.designpattern.structural.decoratorpattern;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newpizza){
		
		super(newpizza);
	}
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", Mozzarella";
	}

	public double getCost(){
		
		return tempPizza.getCost() + .50 ;
	}

}
