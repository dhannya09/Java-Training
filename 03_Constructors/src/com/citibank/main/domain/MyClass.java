package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		System.out.println("Default constructor of MyClass");
	}
	
	public MyClass(int i) {
		System.out.println("Integer constructor of MyClass");
	}
	
	public MyClass(int i,int j) {
		System.out.println("Integer with two parms constructor of MyClass");
	}
	
	public MyClass(String s) {
		System.out.println("String constructor of MyClass");
	}
	
	public void show() {
		System.out.println("Hi");
	}
}
