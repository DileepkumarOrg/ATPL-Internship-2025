package com;

import java.sql.*;

public class Exercise8_UpdateMultipleColumns {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				Statement stmt = con.createStatement()) {
			stmt.executeUpdate("update products_Dileep set name = 'UpdatedProductName', price = 180 where id = 1");
			System.out.println("Updated Record where Id = 1");
			
			ResultSet rs = stmt.executeQuery("Select * from products_Dileep");
			System.out.println("Data : ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+ rs.getString("name")+" "+ rs.getInt("price"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

//	Output : 
//	
//	Updated Record where Id = 1
//	Data : 
//	1 UpdatedProductName 180
//	2 Product2 260
//	3 UpdatedProduct 580
//	4 Product4 499
//	5 Product5 650
