package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit,limit;
	
	
	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		limit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
			if(limit > overdraftLimit) {
				if (amount < limit - overdraftLimit) {
					overdraftLimit = overdraftLimit + amount;
					return true;
				}else {
					amount = amount - (limit - overdraftLimit);
					overdraftLimit = limit;
					setBalance(getBalance()+ amount);
					return true;
				}
			}else {
				//limit=overdraftlimit case
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean withdraw(double amount) {
		if(amount > 0) {
			if (amount <= getBalance()){
				setBalance(getBalance() - amount);
				return true;
			}
			if(amount > getBalance() && amount <= (getBalance() + overdraftLimit)){
				double remainlim = amount - getBalance();
				double remamount = amount - remainlim;
				setBalance(getBalance() - remamount);
				setOverdraftLimit(getOverdraftLimit()- remainlim);
				return true;
			}else {
				System.out.println("Transaction Failed - no sufficent balance");
				return true;
			}
		}return false;
	}
}
	


