package com.citibank.main.service;

import java.util.List;

import com.citibank.com.repository.CustomerRepository;
import com.citibank.com.repository.CustomerRepositoryInterface;
import com.citibank.main.domain.Customer;

public class CustomerService implements CustomerServiceInterface {
	
	//as everything is present in customerRepository we are getting the methods by creating objects
	//ensure you don't provide the provision of setter-getter
	
  //	private CustomerRepository customerRepository = new CustomerRepository();
	//sample of has-a relationship CustomerService has customerRespository - composition.
	
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();
	
	//Spring will create object for you by giving the annotation
	
//	@Autowire    In spring using this annotation object will be created
//	private CustomerRepositoryInterface customerRepository;

	@Override
	public boolean addnewCustomer(Customer customer) {
		return customerRepository.addnewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		return customerRepository.getCustomerByCustomerId(customerId);
		}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.getAllCustomer();
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
		return customerRepository.updateCustomerByCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerRepository.deleteCustomerByCustomerId(customerId);
		
	}

}
