package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"A",10000);
		Employee emp2 = new Employee(2,"B",20000);
		Employee emp3 = new Employee(3,"C",30000);
		Employee emp4 = new Employee(4,"D",40000);
		Employee emp5 = new Employee(5,"E",50000);
	
		//specific Object - hover to toString and Ctrl+click it takes you to Object Class
		//Now you can override the To string in your base class as per your requirement
		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		
		System.out.println("-----------------------------");
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		
		int employeeId;
		String name;
		double salary;
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter employeeID");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter Salary");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
		}
		
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
