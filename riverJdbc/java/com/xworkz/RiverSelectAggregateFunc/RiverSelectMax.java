package com.xworkz.RiverSelectAggregateFunc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelectMax {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = " select max(R_km) from river";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			while(result.next()) {

			int length = result.getInt(1);
			System.out.println("Maximum length :" +length);}

		} finally {
			con.close();
			System.out.println("db connection closed");
		}

	}
}
