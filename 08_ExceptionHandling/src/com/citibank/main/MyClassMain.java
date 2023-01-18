package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		

		MyClass myClass = new MyClass();
		myClass.accept();
		myClass.calculate();
		myClass.display();
		
		System.out.println("Main End");
	}

}
