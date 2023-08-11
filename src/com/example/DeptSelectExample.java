package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptSelectExample {

	public static void main(String[] args) throws SQLException {

		// sqlplus scott/tiger
		String url = "jdbc:oracle:thin:@host:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept");
		
		{
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}
		
		{
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}
		
		{
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}
		
		{
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}
		
		{
			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("[%d, %s, %s]\n", deptno, dname, loc);
		}

		
		conn.close();
		
		System.out.println("Program End...");
	}

}
