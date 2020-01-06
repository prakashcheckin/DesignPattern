package com.designpattern.structural.facadepattern;

public class TestBankAccount {

	public static void main(String[] args){
		
		BankAccountFacade accessingBank = new BankAccountFacade(123456789, 1234);
		
		//accessingBank.withDraw(50);
		//accessingBank.deposite(100);
		
		accessingBank.withDraw(100000);
	}

}
