package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default constructor for Circle");
	}

	public Circle(int size) {
		super(size);
		System.out.println("Parm Constructor for Circle");
		System.out.println("Size ::" + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}
