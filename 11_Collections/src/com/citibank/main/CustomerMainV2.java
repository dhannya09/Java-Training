package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		
		Customer customer1 = new Customer(101,"Dhannya","Pune");
		Customer customer2 = new Customer(102,"Anup","Pune");
		Customer customer3 = new Customer(103,"Unni","Thakurli");
		Customer customer4 = new Customer(104,"Prasanna","Thakurli");
		Customer customer5 = new Customer(105,"Siddharth","Pune");
		
		System.out.println("Adding first customer :: " + customerService.addnewCustomer(customer1));
		System.out.println("Adding second customer :: " + customerService.addnewCustomer(customer2));
		System.out.println("Adding third customer :: " + customerService.addnewCustomer(customer3));
		System.out.println("Adding fourth customer :: " + customerService.addnewCustomer(customer4));
		System.out.println("Adding fifth customer :: " + customerService.addnewCustomer(customer5));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Reading all customer");
		List<Customer> customerList = customerService.getAllCustomer();
		
		//for loop to print the list
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Read One custommer all customer");
		Customer customer = customerService.getCustomerByCustomerId(101);
		System.out.println(customer);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Update customer ");
		Customer customerUpdated = new Customer(101, "Dhannya Nair", "Thakurli");
		boolean result = customerService.updateCustomerByCustomerId(customerUpdated);
		if(result) {
			System.out.println("Updated successfully");
			Customer cus1 = customerService.getCustomerByCustomerId(101);
			System.out.println(cus1);
		}
		else
			System.out.println("No customer found");	
		
		System.out.println("-------------------------------------------------");
		System.out.println("Delete customer ");
		boolean result1 = customerService.deleteCustomerByCustomerId(105);
		if(result1) {
			System.out.println("Customer deleted successfully");
			List<Customer> customerList1 = customerService.getAllCustomer();
		
		//for loop to print the list
		for (Customer cust1 : customerList1) {
			System.out.println(cust1);
		}
		}
		else
			System.out.println("No customer found");	
		
	}

}
