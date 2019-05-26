package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	
	public static int updateSQL(String sql){
		try{
			Class.forName("com.mysql.jdbc.Driver"); // 加载驱动
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=null;
		Statement sta=null;
		try{
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/honor", "root", "admin");
			System.out.println("数据库连接成功！");
			sta = conn.createStatement();
			int n = sta.executeUpdate(sql);
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
		return 0;
	}
	
	public static ResultSet querySQL(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载驱动
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败！");
			e.printStackTrace();
		}

		Connection conn=null;
		Statement sta=null;
		try {
			// 连接数据库
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/honor", "root", "admin");
			System.out.println("数据库连接成功！");
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败！");
			e.printStackTrace();
		} finally {
		}
		return null;
	}
}
