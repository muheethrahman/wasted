package com.xworkz.riverapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverUpdateByNameUsingLenAndOri {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "rootpassword");
			if (conn != null) {
				System.out.println("connected to db");
				Statement statement = conn.createStatement();
				String sql = "UPDATE river SET R_Origin ='yamunotris',R_km=2000 WHERE R_name='yamuna' ";
				int rowsUpdated = statement.executeUpdate(sql);
				System.out.println("total rowsupdated" + rowsUpdated);
				conn.close();
			} else {
				System.out.println("not connected");
			}

		} finally {
			conn.close();
		}
	}
}