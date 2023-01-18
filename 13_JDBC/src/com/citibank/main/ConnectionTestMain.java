package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTestMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection successfull");
			
			// as we pass ?? its secure- also customer id is not provided as its is declared as auto-increment
						String sql = "insert into customer_details(name,address) values(?,?)";
						
						// this prepare statement  will be executed in the above connection
						PreparedStatement preparedStatement = connection.prepareStatement(sql);
						
						
			Scanner scanner = new Scanner(System.in);
			
			for(int i=0; i < 5; i++) {
//				System.out.println("Enter ID");
//				int vid = scanner.nextInt();
//				scanner.nextLine();
				System.out.println("Enter name");
				String vname = scanner.nextLine();

				System.out.println("Enter address");
				String vaddress = scanner.nextLine();
					
		
			//For 100 fields you have to write 100 preparedStatement - in that case code become huge and thus
			//Hibernet/Spring framework came into picture - where it internally write the code for you just have to provide object
			
			preparedStatement.setString(1, vname);
			preparedStatement.setString(2, vaddress);
			
			//executeUpdate is used row insert/update/delete - which return int - how many rows are affected
			int rowCount = preparedStatement.executeUpdate();
			
			if(rowCount > 0) {
				System.out.println("Records inserted successfully");   
			}else {
				System.out.println("Records insertion failed");
			}
			}
			
			System.out.println();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found!!");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}

}
