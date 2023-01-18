package com.citibank.com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();
	
	//for database connectivity
	
	private String sql;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet; //this is required when you want to fetch the data from table and store it in Resultset
	private int rowCount;
	//
	
	
	@Override
	public boolean addnewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name, address) values(?,?)";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Exception while exceuting query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}return false;
	
		
//		return customerList.add(customer); //the add method return boolean so no need to additionally the return false
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
//		for (Customer customer : customerList) {
//			if (customer.getCustomerID() == customerId) {
////				System.out.println("Customer Id found ::" + customer);
//				return customer;
//			}		
//		}
		//for DB2 part
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details where customer_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			//As we have ? we have to set a value
			preparedStatement.setInt(1, customerId);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				customerId = resultSet.getInt("customer_id");
				String name	= resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details";
		
		customerList.clear();  //as you don't want to get the records repititively 
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int customerId = resultSet.getInt("customer_id");
				String name	= resultSet.getString("name");
				String address = resultSet.getString("address");
				
				Customer customer = new Customer(customerId, name, address);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerId(Customer customer) {
//		for (Customer c : customerList) {
//			if (c.getCustomerID() == customer.getCustomerID()) {
////				System.out.println("Customer Id found ::" + customer);
//				c.setName(customer.getName());
//				c.setAddress(customer.getAddress());
////				System.out.println("Customer details are updated successfully");
//				return true;
//			}		
//		}
		
		connection = new ConnectionFactory().getConnection();
		sql = "update customer_details set name=? , address=? where customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			
			//Ensure the order 1,2,3 is as per the query mentioned above - so customer_id is at 3rd position
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3, customer.getCustomerID());
			
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Exception while exceuting query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
//		for (Customer customer : customerList) {
//			if (customer.getCustomerID() == customerId) {
////				System.out.println("Customer Id found ::" + customer);
//				return customerList.remove(customer);
////				System.out.println("Customer details are deleted successfully");
////				return true; as remove method returns boolean
//			}		
//		}
		
		connection = new ConnectionFactory().getConnection();
		sql = "delete from customer_details where customer_id=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			
			
			//Ensure the order 1,2,3 is as per the query mentioned above - so customer_id is at 3rd position
			
			preparedStatement.setInt(1, customerId);
			
			rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Exception while exceuting query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

}
