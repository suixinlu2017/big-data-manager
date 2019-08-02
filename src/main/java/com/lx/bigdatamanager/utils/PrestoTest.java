package com.lx.bigdatamanager.utils;

import java.sql.*;


/**
 * @program: big-data-manager
 * @description: asdas
 * @author: chenyulong
 * @create: 2019-08-01 20:04
 **/
public class PrestoTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.facebook.presto.jdbc.PrestoDriver");
		Connection connection = DriverManager.getConnection("jdbc:presto://10.1.222.30:20080/hive/default","root",null);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("show tables");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		rs.close();
		connection.close();
	}
}
