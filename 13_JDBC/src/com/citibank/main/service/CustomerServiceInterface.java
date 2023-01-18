package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {
	
	public boolean addnewCustomer(Customer customer);
	
	//Return Customer  - Read one
	public Customer getCustomerByCustomerId(int customerId);
	
	//Return the Customer List - Read all customer
	public List<Customer> getAllCustomer();
	
	//we need to pass customer as we need to pass the data to be updated as well with id will return true/false
	public boolean updateCustomerByCustomerId(Customer customer);
	
	//will return true/false
	public boolean deleteCustomerByCustomerId(int customerId);
}
