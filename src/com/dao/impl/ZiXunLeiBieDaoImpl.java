package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ZiXunLeiBieDao;
import com.entity.ZiXunLeiBie;
import com.util.DBManager;

public class ZiXunLeiBieDaoImpl implements ZiXunLeiBieDao{

	public List<ZiXunLeiBie> getZiXunLeiBie() {
		List<ZiXunLeiBie> list=new ArrayList<ZiXunLeiBie>();
		ResultSet rs = DBManager.querySQL("SELECT * from zixunleibie ;");
		try {
			while(rs.next()){
				ZiXunLeiBie zxlb=new ZiXunLeiBie();
				zxlb.setId(rs.getInt(1));
				zxlb.setLeibie(rs.getString(2));
				list.add(zxlb);
				return list;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
