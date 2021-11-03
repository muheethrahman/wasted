package com.xworkz.RiverSelectAggregateFunc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelectMaxAndMin {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = " select max(R_km),min(R_km) from river";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			result.next();

			int max = result.getInt(1);
			System.out.println("Maximum length :" +max);
			int min = result.getInt(2);
			System.out.println("Minimum length :" +min);
			

		} finally {
			con.close();
			System.out.println("db connection closed");
		}

	}
}
