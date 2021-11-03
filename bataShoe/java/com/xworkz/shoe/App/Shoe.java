package com.xworkz.shoe.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Shoe {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoes","root","rootpassword");
		if(conn!=null) {
			System.out.println("connected to db");
			Statement statement= conn.createStatement();
			String sql="INSERT INTO shoe VALUES(1,'bata',2500,'black',8)";
			int rowsUpdated=statement.executeUpdate(sql);
			
		}
		else {
			System.out.println("not connected");
		}

			}
}
