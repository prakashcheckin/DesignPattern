package com.designpattern.structural.decoratorpattern;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newpizza) {
		
		super(newpizza);
		
	}
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", TomatoSauce ";
	}

	public double getCost(){
		
		return tempPizza.getCost() + .35 ;
	}


}
