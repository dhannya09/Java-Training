package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> customerSet = new HashSet<>();
		
		Customer customer1 = new Customer(101,"Dhannya","Pune");
		Customer customer2 = new Customer(102,"Anup","Pune");
		Customer customer3 = new Customer(103,"Unni","Thakurli");
		Customer customer4 = new Customer(104,"Prasanna","Thakurli");
		Customer customer5 = new Customer(105,"Siddharth","Pune");
		Customer customer6 = new Customer(105,"Siddharth","Pune");
		
		System.out.println("First Hashcode :: " + customer1.hashCode());
		System.out.println("Adding first customer :: " + customerSet.add(customer1));
//		System.out.println("Adding second customer :: " + customerSet.add(customer2));
//		System.out.println("Adding third customer :: " + customerSet.add(customer3));
//		System.out.println("Adding fourth customer :: " + customerSet.add(customer4));
		System.out.println("Fifth Hashcode :: " + customer5.hashCode());
		System.out.println("Adding fifth customer :: " + customerSet.add(customer5));
		
		System.out.println("Fifth Hashcode :: " + customer6.hashCode());
		System.out.println("Adding sixth customer :: " + customerSet.add(customer6));
//		
		System.out.println(customerSet);
	}
}
	
