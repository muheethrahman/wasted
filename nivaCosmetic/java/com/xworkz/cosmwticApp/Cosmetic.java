package com.xworkz.cosmwticApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cosmetic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cosmetics","root","rootpassword");
		if(conn!=null) {
			System.out.println("connected to db");
			Statement statement= conn.createStatement();
			String sql="INSERT INTO cosmetic VALUES(1,'facwash',250,'male_or_female'2356.0)";
			int rowsUpdated=statement.executeUpdate(sql);
			
		}
		else {
			System.out.println("not connected");
		}

			}
}
