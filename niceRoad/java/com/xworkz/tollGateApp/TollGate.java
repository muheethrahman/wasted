package com.xworkz.tollGateApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TollGate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","rootpassword");
		if(conn!=null) {
			System.out.println("connected to db");
			Statement statement= conn.createStatement();
			String sql="INSERT INTO toll VALUES(1,4,'mysore_road','bangalore')";
			int rowsUpdated=statement.executeUpdate(sql);
			
		}
		else {
			System.out.println("not connected");
		}

			}
}
