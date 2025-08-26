package com;

import java.sql.*;


public class Exercise1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("Select * from products_Dileep");
		while(rs.next()) {
			System.out.println(rs.getInt("id") +" "+ rs.getString("name"));
		}
		con.close();
	}

}
