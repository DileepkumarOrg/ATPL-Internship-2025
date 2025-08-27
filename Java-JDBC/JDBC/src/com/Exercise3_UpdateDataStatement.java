package com;

import java.sql.*;

public class Exercise3_UpdateDataStatement {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025", "intern2025");
				Statement smt = con.createStatement()){
			
			String sqlQuery = "Update products_Dileep set name = 'UpdatedProduct' where id = 3";
			smt.executeUpdate(sqlQuery);
			System.out.println("products_Dileep is updated\n Results are shown below ");
			ResultSet rs = smt.executeQuery("Select * from products_Dileep");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + rs.getString("name"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}



// Output : 
/*
	products_Dileep is updated
	Results are shown below 
	1Product1
	2Product2
	3UpdatedProduct
	4Product4
	5Product5
*/