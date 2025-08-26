package com;

import java.sql.*;

public class Exercise7 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern", "intern2025",
				"intern2025"); Statement stmt = con.createStatement()) {
			stmt.executeUpdate("delete from products_Dileep  where id = 6");
			ResultSet rs = stmt.executeQuery("Select * from products_Dileep");
			 System.out.println("Record Deleted.\n Remaining Records are : ");
			 while(rs.next()) { System.out.println(rs.getInt("id")+" "+ rs.getString("name"));
			 }

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

//Output

//Record Deleted.
//Remaining Records are : 
//1 Product1
//2 Product2
//3 UpdatedProduct
//4 Product4
//5 Product5

