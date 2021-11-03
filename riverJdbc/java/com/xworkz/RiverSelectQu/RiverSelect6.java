package com.xworkz.RiverSelectQu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelect6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = " select R_Origin from  river WHERE R_name='cauvery' and R_Origin='kodagu'";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			result.next();

			String origin = result.getString(1);
			System.out.println("Origin:" + origin);

		} finally {
			con.close();
			System.out.println("db connection closed");
		}

	}
}
