package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("Default Constructor for Triangle");
	}

	public Triangle(int size) {
		System.out.println("Parm Constructor for Triangle");
		System.out.println("Size ::" + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle");

	}
}
