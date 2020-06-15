package com.designpattern.structural.facadepattern;

public class SecurityCode {

	private int securiyCode = 1234; 

	public boolean isCodeCorrect(int securiyCode) {
		
		if(this.securiyCode == securiyCode) 
		{
			return true;
		}
		return false;
	}
}
