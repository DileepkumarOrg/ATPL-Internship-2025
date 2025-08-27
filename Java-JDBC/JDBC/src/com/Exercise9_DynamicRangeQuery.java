package com;

import java.sql.*;

public class Exercise9_DynamicRangeQuery {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement pstmt = con.prepareStatement("Select * from products_Dileep where Price between ? and ?")) {
			pstmt.setInt(1, 100);
			pstmt.setInt(2, 500);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+ rs.getString("name")+" "+ rs.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
