package com.emp;

import java.sql.*;

public class DBUtil {
	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "SCOTT", "tiger");
		return con;
	}
}