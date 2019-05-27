package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ZiXunDao;
import com.entity.ZiXun;
import com.util.DBManager;

public class ZiXunDaoImpl implements ZiXunDao {

	public List<ZiXun> getZiXun() {
		List<ZiXun> zxl = new ArrayList<ZiXun>();
		ResultSet rs = DBManager.querySQL("SELECT * from zixun ;");
		try {
			while (rs.next()) {
				ZiXun zx = new ZiXun();
				zx.setId(rs.getInt(1));
				zx.setTitle(rs.getString(2));
				zx.setZixunneirong(rs.getString(3));
				zx.setZixunid(rs.getInt(4));
				zxl.add(zx);
			}
			return zxl;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
