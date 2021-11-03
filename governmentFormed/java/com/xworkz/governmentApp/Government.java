package com.xworkz.governmentApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Government {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/government","root","rootpassword");
		if(conn!=null) {
			System.out.println("connected to db");
			Statement statement= conn.createStatement();
			String sql="INSERT INTO govt VALUES(1,'jds',3,'kumarswami')";
			int rowsUpdated=statement.executeUpdate(sql);
			
		}
		else {
			System.out.println("not connected");
		}

			}
}
