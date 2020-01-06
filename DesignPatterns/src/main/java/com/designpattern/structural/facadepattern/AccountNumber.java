package com.designpattern.structural.facadepattern;

public class AccountNumber {
	
	private int accountNumber = 123456789; 

	public boolean accountNumberCheck(int accountNumber) {
		
		if(this.accountNumber == accountNumber) 
		{
			return true;
		}
		return false;
	}
	
}
