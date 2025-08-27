package com;

import java.sql.*;

public class Exercise6_SearchRecordsPartialMatch { 

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// By using Statement
		  try( Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025"); 
				  Statement stmt = con.createStatement();
				  ) 
		  {
			  ResultSet rs = stmt.executeQuery("select * from products_Dileep  where name like 'Update%'"
		  ); 
			  System.out.println("By using Statement : ");
		  while(rs.next()) {
			  System.out.println(rs.getInt("id")+" "+rs.getString("name")); 
			  } 
		  } 
		  catch
		  (SQLException e) { e.printStackTrace(); }
		 
		// By using PreparedStatement
		try (Connection con = DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/Intern","intern2025","intern2025");
				PreparedStatement pstm = con.prepareStatement("select * from products_Dileep  where name like ?");
				){
			pstm.setString( 1, "Updat%");
			ResultSet rs = pstm.executeQuery();
			System.out.println("By using PreparedStatement : ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


//	Output : 
//		
//	By using Statement : 
//	3 UpdatedProduct
//	By using PreparedStatement : 
//	3 UpdatedProduct

