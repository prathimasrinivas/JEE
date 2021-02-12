package com.xworkz.nykaStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnectionToCosmaticsTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/nyka"; 
		String username="root";
		String password="Hamsa@25";
		
		try {
			Connection conn=DriverManager.getConnection(url,username,password);
			System.out.println(conn);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
