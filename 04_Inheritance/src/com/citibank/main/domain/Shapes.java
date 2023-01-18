package com.citibank.main.domain;

//Generalization
public abstract class Shapes {
	
	public Shapes() {
		System.out.println("Default Constructor for Shapes");
	}
	
	public Shapes(int size) {
		System.out.println("Parm Constructor for Shapes");
		System.out.println("Size ::" + size);
	}
	
//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}
	
	public abstract void draw(); 
	
	public void convertShapes() {
		System.out.println("Converting Shapes");
	}
}
