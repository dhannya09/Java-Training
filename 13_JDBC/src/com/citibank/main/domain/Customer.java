package com.citibank.main.domain;

import java.util.Objects;

public class Customer {

	private int customerID;
	private String name;
	private String address;
	
	public Customer(int customerID, String name, String address) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In Hashcode");
		return Objects.hash(customerID);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerID == other.customerID;
	}
	
	
}
