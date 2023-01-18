package com.citibank.main;

import java.util.Iterator;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		greeter.greet();
	
		System.out.println("----------------------------");
		//Anonymous Inner Class - class i implementing interface and provide the method here
		Greeter goodEveningGreeter = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening Java");
				
			}
		};
		goodEveningGreeter.greet();
		
		System.out.println("----------------------------");
		
		Greeter greeter2 = () -> {
			System.out.println("My Way");
		};
		greeter2.greet();
		
		System.out.println("----------------------------");
		
		//Run method is set here
		Runnable runnable = () -> System.out.println("We are in thread");
		Thread thread= new Thread(runnable);
		thread.start();
		
		Thread thread2 = new Thread(
				() -> System.out.println("We are in thread")
				);
		thread2.start();
		
		System.out.println("-----------------------------");
		new Thread(() -> System.out.println("We are in thread")).start();
		
		new Thread(() -> {
			for (int i = 0 ;i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread is running" + i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		).start();
		
		
	}

}
