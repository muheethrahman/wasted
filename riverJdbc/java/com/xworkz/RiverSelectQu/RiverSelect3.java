package com.xworkz.RiverSelectQu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelect3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = "select R_id from  river WHERE R_name='cauvery'";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			while (result.next()) {
				int id = result.getInt(1);
				System.out.println("id:" + id);
			}
		} finally {
			con.close();
		}
	}
}