package com.citibank.main.domain;

public class Account {
	
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount) {
		if (amount > balance) {
			try {
				wait(10);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Withdraw Start");
		balance = balance - amount;
		System.out.println("Balance after Withdraw:" + balance);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Withdraw End");
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Deposit Start");
		balance = balance + amount;
		System.out.println("Balance after Deposit:" + balance);
		
		notify();
		
		System.out.println("Deposit End");
	}

}
