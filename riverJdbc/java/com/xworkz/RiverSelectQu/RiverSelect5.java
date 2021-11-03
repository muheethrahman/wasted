package com.xworkz.RiverSelectQu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelect5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = "select R_id,R_km,R_No_Dam from  river WHERE R_name='cauvery' and R_Origin='kodagu'";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			while (result.next()) {
				int id = result.getInt(1);
				System.out.println("id:" + id);
				int km = result.getInt(2);
				System.out.println("km in length:" + km);
				String noDam = result.getString(3);
				System.out.println("no of dams:" + noDam);
			}
		} finally {
			con.close();
			System.out.println("db connection closed");
		}
	}
}