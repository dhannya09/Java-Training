package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("-----------------------");
		new MyClass().show();
		System.out.println("-----------------------");
		new MyClass(10);
		System.out.println("-----------------------");
		new MyClass(10,20);
		System.out.println("-----------------------");
		new MyClass("Dhannya");
		System.out.println("-----------------------");
		System.out.println("Main End");

	}

}
