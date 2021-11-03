package com.xworkz.RiverSelectAggregateFunc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.xworkz.DBConsts.DBConst;

public class RiverSelectCount {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(DBConst.driver);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBConst.URL, DBConst.username, DBConst.password);
			Statement state = con.createStatement();
			String sql = " select count(*) from river";
			ResultSet result = state.executeQuery(sql);
			System.out.println(result);
			while(result.next()) {

			int count = result.getInt(1);
			System.out.println("TOtal Count:" +count);}

		} finally {
			con.close();
			System.out.println("db connection closed");
		}

	}
}
