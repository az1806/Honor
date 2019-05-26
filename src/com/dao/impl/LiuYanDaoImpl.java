package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.LiuYanDao;
import com.entity.LiuYan;
import com.util.DBManager;

public class LiuYanDaoImpl implements LiuYanDao{

	

	public List<LiuYan> getLiuYan() {
		List<LiuYan> lyl=new ArrayList<LiuYan>();
		ResultSet rs = DBManager.querySQL("SELECT id FROM liuyan ;");
		try {
			while(rs.next()){
				LiuYan ly=new LiuYan();
				ly.setId(rs.getInt(1));
				lyl.add(ly);
				return lyl;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
