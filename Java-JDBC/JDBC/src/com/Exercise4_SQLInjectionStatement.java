package com;

import java.sql.*;

public class Exercise4_SQLInjectionStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				Statement stmt = con.createStatement()) {
			String id = "' ' or 1=1";
			String query = "Select * from Products_Dileep where id ="+ id;
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+ rs.getString("name")+ " "+ rs.getInt("price"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
