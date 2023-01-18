package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;

		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String continueChoice;
		boolean isSalary;

		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		//accept do you want to open salary account
		System.out.println("Do you want to open Salary account");
		isSalary = scanner.nextBoolean();
		

//		account = new Account(accountNumber, name, balance);
		savings = new Savings(accountNumber, name, balance, isSalary);
//		account.setAccountNumber(accountNumber);
//		account.setName(name);
//		account.setBalance(balance);

		System.out.println("Account Opened Successfully!!");
		System.out.println("Account Number :: " + savings.getAccountNumber());
		System.out.println("Name :: " + savings.getName());
		System.out.println("Balance :: " + savings.getBalance());
		System.out.println("Account Type::" + savings.isSalary());

		System.out.println();
		do {
			showTransactionMenu(scanner, savings);
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank you!!");
	}

	private static void showTransactionMenu(Scanner scanner, Savings savings) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. For Withdraw");
		System.out.println("Press 2. For Deposit");
		System.out.println("Press 3. For Check Balance");
		System.out.println("Press 4. For Exit");
		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to Withdraw");
			amount = scanner.nextDouble();
			if (savings.withdraw(amount))
				System.out.println("Withdraw Successfull!");
			else
				System.out.println("Withdraw Failed");
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if (savings.deposit(amount))
				System.out.println("Deposit Successfull!");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + savings.getBalance());
			break;
		case '4':
			System.out.println("Thank you!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
