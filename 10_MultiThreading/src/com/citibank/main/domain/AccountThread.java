package com.citibank.main.domain;

public class AccountThread implements Runnable{

	private Account account;
	private int transactionChoice;
	private double amount;
	


	public AccountThread(Account account, int transactionChoice, double amount) {
		super();
		this.account = account;
		this.transactionChoice = transactionChoice;
		this.amount = amount;
	}


	@Override
	public void run() {
		
		if(transactionChoice == 1) {
			account.withdraw(amount);
		}else {
			account.deposit(amount);
		}
		
		
	}
	
	
	

}
