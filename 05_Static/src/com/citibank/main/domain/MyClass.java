package com.citibank.main.domain;

public class MyClass {
	private int num1 = 10;
	public static int num2 = 10;
	final int max = 500;
	
	//Static Block
	static {
		System.out.println("Static block of MyClass");
	}
	//Non-static Block
	{
		System.out.println("Non-Static block of MyClass");
	}
	public MyClass() {
		System.out.println("Default Constructor of MyClass");
	}
	public void display() {
		System.out.println("Num1:" +num1);
		System.out.println("Num2:" +num2);
		System.out.println("Max:" +max);
		num1 = num1 + 10;
		num2 = num2 + 10;
//		max = max + num1 +num2;
		System.out.println("Num1:" +num1);
		System.out.println("Num2:" +num2);
		System.out.println("Max:" +max);
	}

}
