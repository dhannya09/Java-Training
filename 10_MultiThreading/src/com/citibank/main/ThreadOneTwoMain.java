package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadOneTwoMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		System.out.println("Main is creating child ThreadOne");
		ThreadOne threadOne = new ThreadOne(); // as we have inheritance both child and parent class objects are created
		threadOne.start();
		
		System.out.println("Main is careting child ThreadTwo");
		ThreadTwo two = new ThreadTwo();
		
		//pass object if type Runnable - we need a Thread method so we have to create a relation with Thread class
		//as Thread class method has to be used
		
		Thread threadTwo = new Thread(two); 
		threadTwo.start();
		
		System.out.println("Main End");

	}

}
