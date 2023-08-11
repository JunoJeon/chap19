package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptselectMySQLExample {

	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:mysql://host:3306/world";
		String user = "root";
		String password = "1234";
		System.out.println("[MySQL]");
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept");
		
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		System.out.println("Program end");

	}

}
