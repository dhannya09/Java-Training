package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
//		Circle circle = new Circle(10);
//		circle.draw();
		
//		Shapes shapes = new Circle();
//		shapes.draw();
//		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice:: 1-Circle, 2-Triangle , 3- Line");
		int choice = scanner.nextInt();
		
		Shapes shapes = getShapes(choice);
		shapes.draw();
	}
// Method has been made statis as we are cant refer nonstatic method in main which is static both has to 
//	be static - Shapes here is of return type object
	
	public static Shapes getShapes(int choice) {
		if (choice == 1) {
			Shapes shapes = new Circle();
			return shapes;
		}
		if (choice == 2) {
			//you can either write as below or mention as specified in choice 1
			return new Triangle();
			}
		if (choice == 3) {
			return new Line();
			}
	//	return new Shapes(); as we made the Shapes class abstract
		return null;
	}
}
