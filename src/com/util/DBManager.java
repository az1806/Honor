package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	
	public static int updateSQL(String sql){
		try{
			Class.forName("com.mysql.jdbc.Driver"); // ��������
			System.out.println("�������سɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=null;
		Statement sta=null;
		try{
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/honor", "root", "admin");
			System.out.println("���ݿ����ӳɹ���");
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
			Class.forName("com.mysql.jdbc.Driver"); // ��������
			System.out.println("�������سɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��������ʧ�ܣ�");
			e.printStackTrace();
		}

		Connection conn=null;
		Statement sta=null;
		try {
			// �������ݿ�
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/honor", "root", "admin");
			System.out.println("���ݿ����ӳɹ���");
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���ݿ�����ʧ�ܣ�");
			e.printStackTrace();
		} finally {
		}
		return null;
	}
}
