package com.designpattern.structural.facadepattern;

/*THis is a facade class.
Facade class hide all complex implementation of the service.
Facade show only easy method to user.
User reach the Facade class and facade class communicate to the inner business logics.*/
public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	WelcomeToBank bank;
	AccountNumber account;
	Funds fund;
	SecurityCode code;
	
	public BankAccountFacade(int accountNumber, int securityCode) 
	{
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		bank = new WelcomeToBank();
		account = new AccountNumber();
		fund = new Funds();
		code = new SecurityCode();
	}

	public void withDraw(double cash) { 
		
		if(account.accountNumberCheck(this.accountNumber) && code.isCodeCorrect(this.securityCode)) 
		{
			fund.withDrawMoneyInAccount(cash);
		}
	}
	
	public void deposite(double cash) {
		
		if(account.accountNumberCheck(this.accountNumber)) 
		{
			fund.depsiteMoneyInAccount(cash);	
			
		}else 
		{
			System.out.println("Invalid account");
		}
	}
}
