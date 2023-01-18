package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountThreadMain {

	public static void main(String[] args) {
		Account account = new Account(50000);
		
		AccountThread accountThread1 = new AccountThread( account, 1, 10000);
		Thread threadOne = new Thread(accountThread1);
		threadOne.start();
		
		AccountThread accountThread2 = new AccountThread( account, 2, 15000);
		Thread threadTwo = new Thread(accountThread2);
		threadTwo.start();
	}

}
