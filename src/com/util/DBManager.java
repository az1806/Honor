package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	public static ResultSet querySQL(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("��������ʧ�ܣ�");
			e.printStackTrace();
		}

		Connection con = null;
		Statement sta = null;
		try {
			con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/honor", "root", "admin");
			sta = (Statement) con.createStatement();
			ResultSet rs = (ResultSet) sta.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ�ܣ���ִ��sqlʧ�ܣ�");
			e.printStackTrace();
		} finally {
//			try {
//				if (sta != null) {
//					sta.close();
//				}
//				if (con != null) {
//					con.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				System.out.println("���ݿ����ӹر�ʧ�ܣ�");
//				e.printStackTrace();
//			}
		}

		return null;
	}

}
