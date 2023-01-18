package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Default Constructor for Line");
	}

	public Line(int size) {
		System.out.println("Parm Constructor for Line");
		System.out.println("Size ::" + size);
	}
	
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
