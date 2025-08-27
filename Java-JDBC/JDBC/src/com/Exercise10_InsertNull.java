package com;

import java.sql.*;

public class Exercise10_InsertNull {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try( Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement pstmt = con.prepareStatement("Insert into products_Dileep values (?,?,?)")){
			pstmt.setInt(1, 6);
			pstmt.setString(2, "Product6");
			pstmt.setNull(3, Types.INTEGER);
			System.out.println("inserted a null Price\n");
			pstmt.executeUpdate();
			ResultSet rs = pstmt.executeQuery("Select * from Products_Dileep");
			System.out.println("After Inserting Data : ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}



//	Output 

//	inserted a null Price
//	After Inserting Data : 
//	1 UpdatedProductName 180
//	2 Product2 260
//	3 UpdatedProduct 580
//	4 Product4 499
//	5 Product5 650
//	6 Product6 0
