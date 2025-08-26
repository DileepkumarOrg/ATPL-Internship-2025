package com;

import java.sql.*;

public class Exercise2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern", "intern2025", "intern2025");
		String sqlQuery = "insert into products_Dileep values (?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
		preparedStatement.setInt(1, 5);
		preparedStatement.setString(2, "Product5");
		int rowsNumber = preparedStatement.executeUpdate();
		System.out.println("Executed rows "+ rowsNumber);
		
		Statement stmt = con.createStatement();
		ResultSet re = stmt.executeQuery("Select * from products_Dileep");
		while(re.next()) {
			System.out.println(re.getInt("id") + re.getString("name"));
		}
		preparedStatement.close();
		con.close();
	}

}


// Output 
/*
	Executed rows 1
	1Product1
	2Product2
	3Product3
	4Product4
	5Product5
*/

