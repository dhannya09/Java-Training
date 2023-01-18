package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;

	public void accept() {
		
		Scanner scanner = new Scanner(System.in);
		
		try {		
		System.out.println("Enter Num1");
		num1 = scanner.nextDouble();
		System.out.println("Enter Num2");
		num2 = scanner.nextDouble();
	}catch(InputMismatchException e) {
		System.out.println("Invalid Input from user");
		System.out.println("Program will continue its execution");
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println("Exception in code!!");
		System.out.println(e.getMessage());
	}
		finally {
			System.out.println("Thank you");
			scanner.close();
		}
	}
	
	public void calculate() {
		System.out.println("Calculating Result");
		result = num1 / num2;
	}
	
	public void display() {
		System.out.println("Value of result:" + result);
	}
}
