package com;

import java.sql.*;

public class Exercise12_PreparedStatementReuse {
	
	public static int[] ids = {1,2,3,4,5,6};

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement pstmt = con.prepareStatement("Select * from products_Dileep where id = ?")) {
			for(int index = 0; index < ids.length ; index++) {
				pstmt.setInt(1, ids[index]);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt("id")+" "+ rs.getString("name")+" "+rs.getInt("price"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

