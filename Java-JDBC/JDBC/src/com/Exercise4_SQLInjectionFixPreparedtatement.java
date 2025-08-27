package com;

import java.sql.*;

public class Exercise4_SQLInjectionFixPreparedtatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement pstmt = con.prepareStatement("Select * from products_Dileep where id = ?")){
			pstmt.setInt(1, 3);
			
			// pstmt.setString(1, "' ' or 1==1"); 
			
			ResultSet rs  = pstmt.executeQuery();
			System.out.println("Fetching Data based on condition : ");
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
