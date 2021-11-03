package com.xworkz.RiverSelectQu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.DBConsts.DBConst;

public class RiverSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = "select * from river where R_name='cauvery'";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			while (result.next()) {
				int id = result.getInt(1);
				System.out.println("id:" + id);
				String name = result.getString(2);
				System.out.println("name:" + name);
				int pollution = result.getInt(3);
				System.out.println("pollution:" + pollution);
				int km = result.getInt(4);
				System.out.println("km in length:" + km);
				String origin = result.getString(5);
				System.out.println("Origin:" + origin);
				String noDam = result.getString(6);
				System.out.println("no of dams:" + noDam);
			}
		} finally {
			con.close();
			System.out.println("db connection closed");
		}

	}
}