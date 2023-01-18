package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {
	 
	
	public static void main(String[] args) {
		//addition
		CalculationsInterface calculationsInterface = new CalculationsInterface() {
			
			@Override
			public double doCalculations(double number1, double number2) {
				return number1 + number2;
			}
		};

		double result = calculationsInterface.doCalculations(10, 20);
		System.out.println("Addition :: " + result);
		
		System.out.println("--------------------------------");
		
		//it is not necessary to mention return below
		calculationsInterface = (n1, n2) -> n1 + n2;
		System.out.println("Result :: " + calculationsInterface.doCalculations(10, 30));
		System.out.println("--------------------------------");
		
//		CalculationsInterface calculationInterface2 = (n1, n2) -> {
//			double res = n1 + n2;
//			return res;
//		};
//		
//		result = calculationInterface2.doCalculations(10, 20);
//		System.out.println("Result2 :: " + result);
	}

}
