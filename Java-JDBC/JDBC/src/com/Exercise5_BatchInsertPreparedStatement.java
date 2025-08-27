package com;

import java.sql.*;

public class Exercise5_BatchInsertPreparedStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement psmt = con.prepareStatement("Insert into products_Dileep values(?,?,?)")){
			
			con.setAutoCommit(false);
			psmt.setInt(1, 7);
			psmt.setString(2, "Product7");
			psmt.setInt(3, 245);
			
			psmt.addBatch();
			
			psmt.setInt(1, 8);
			psmt.setString(2, "Product8");
			psmt.setInt(3, 745);
			
			psmt.addBatch();
			
			psmt.setInt(1, 9);
			psmt.setString(2, "Product9");
			psmt.setInt(3, 352);
			
			psmt.addBatch();
			
			psmt.executeBatch();
			
			ResultSet rs = psmt.executeQuery("Select * from Products_Dileep");
			System.out.println("After Inserting data ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+ rs.getString("name")+" "+ rs.getInt("price"));
			}
			con.commit();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}



//	Output :
//
//	After Inserting data 
//	1 UpdatedProductName 180
//	2 Product2 260
//	3 UpdatedProduct 580
//	4 Product4 499
//	5 Product5 650
//	6 Product6 0
//	7 Product7 245
//	8 Product8 745
//	9 Product9 352


