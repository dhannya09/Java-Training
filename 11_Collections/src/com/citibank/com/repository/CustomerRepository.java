package com.citibank.com.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();
	
	@Override
	public boolean addnewCustomer(Customer customer) {
		return customerList.add(customer); //the add method return boolean so no need to additionally the return false
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		for (Customer customer : customerList) {
			if (customer.getCustomerID() == customerId) {
//				System.out.println("Customer Id found ::" + customer);
				return customer;
			}		
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		for (Customer c : customerList) {
			if (c.getCustomerID() == customer.getCustomerID()) {
//				System.out.println("Customer Id found ::" + customer);
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
//				System.out.println("Customer details are updated successfully");
				return true;
			}		
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		for (Customer customer : customerList) {
			if (customer.getCustomerID() == customerId) {
//				System.out.println("Customer Id found ::" + customer);
				return customerList.remove(customer);
//				System.out.println("Customer details are deleted successfully");
//				return true; as remove method returns boolean
			}		
		}
		return false;
	}

}
