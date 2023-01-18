package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("Main start");
		//object creation
		Account account = new Account();
//		account.accountNumber = 12345;
//		account.name = "Dhannya Nair";
//		account.balance = 1000;
		
		
		account.setAccountNumber(12345);
		System.out.println(account.getAccountNumber());
		
		//function calling
		account.deposit(100);
		account.withdraw(100);
		
		System.out.println("Main end");
	}

}
