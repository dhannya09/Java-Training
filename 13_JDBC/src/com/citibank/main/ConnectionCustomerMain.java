package com.citibank.main;

import java.util.List;

import com.citibank.com.repository.CustomerRepository;
import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class ConnectionCustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService customerService = new CustomerService();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Get All customers");
		List<Customer> customerList1 = customerService.getAllCustomer();
		
		//for loop to print the list
		for (Customer cust1 : customerList1) {
			System.out.println(cust1);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Get customer by customer ID");
		// service. method is returning a object customer so we are not creating customer object
		Customer cust1 = customerService.getCustomerByCustomerId(10);
		
		if (cust1 != null) {
			System.out.println("Customer Found");
			System.out.println(cust1);
			
		}else {
			System.out.println("Customer not Found");
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Insert customer");
		//pass 0 if the customer id is auto incremented
		Customer customer = new Customer(0, "Vidhya Athilat", "Thakurli Thane");
		
		if (customerService.addnewCustomer(customer)) {
			System.out.println("Record inserted successfully");
			List<Customer> customerList2 = customerService.getAllCustomer();
			
			//for loop to print the list
			for (Customer cust2 : customerList2) {
				System.out.println(cust2);
			}
		}else {
			System.out.println("Record insertion failed");
		}
		
		System.out.println("------------------------------------------------------");

		System.out.println("Update customers");
		Customer customer1 = new Customer(11, "Vidhya Sushant", "Vikhroli Mumbai");
		if (customerService.updateCustomerByCustomerId(customer1)) {
			System.out.println("Record updated successfully");
			
			List<Customer> customerList3 = customerService.getAllCustomer();
			
			//for loop to print the list
			for (Customer cust3 : customerList3) {
				System.out.println(cust3);
			}
		}else {
			System.out.println("Record updation failed");
		}	
		
		System.out.println("------------------------------------------------------");
		System.out.println("Delete customers");
		if (customerService.deleteCustomerByCustomerId(13)) {
			System.out.println("Record deleted successfully");
			
//			List<Customer> customerList4 = customerService.getAllCustomer();
//			
//			//for loop to print the list
//			for (Customer cust4 : customerList4) {
//				System.out.println(cust4);
//			}
		}else {
			System.out.println("Record deletion failed");
		}	
		System.out.println("------------------------------------------------------");
	}

}
