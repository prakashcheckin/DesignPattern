package com.designpattern.structural.facadepattern;

public class Funds {
	
	private double funds = 1000;

	public double getFundsInAccount() {
		
		return funds;
	} 
	
	public void decreaseCashInAccount(double cashWithdraw) {
		
		funds -= cashWithdraw;
	}
	
	public void increaseCashInAccount(double cashDeposite) {
		
		funds += cashDeposite;
	}

	public boolean fundChecker(double cashWithdraw) {
		
		if(funds > cashWithdraw) 
		{
			return true;
		}
		return false;
	}
	
	public boolean withDrawMoneyInAccount(double cashWithdraw){
		
		if(fundChecker(cashWithdraw)) 
		{
			decreaseCashInAccount(cashWithdraw);
			System.out.println("Cash withdraw successfull. Your current balance is " + getFundsInAccount());
			return true;
		}
		else
		{
			System.out.println("Error : Insufficent Balance");
			System.out.println("Current Balance " + funds);
			return false;
		}
	}
	
	public void depsiteMoneyInAccount(double cashdeposite){
		
		increaseCashInAccount(cashdeposite);
		System.out.println("Cash Deposite successfull. Your current balance is " + getFundsInAccount());
	}
}
