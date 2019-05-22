package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.ManagerDao;
import com.entity.Manager;
import com.util.DBManager;

public class ManagerDaoImpl  implements ManagerDao{
	public Manager queryManager() {

		Manager com = new Manager();

		ResultSet rs = DBManager.querySQL("select * from guanliyuan");
		try {
			while (rs.next()) {
      com.setName(rs.getString(2));
      com.setMiMa(rs.getString(4));
      return com;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  return com;
	}
}
