package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.GongSiDao;
import com.entity.GongSi;
import com.util.DBManager;

public class GongSiDaoImpl implements GongSiDao{

	public List<GongSi> getGongSi() {
		List<GongSi> gsl=new ArrayList<GongSi>();
		ResultSet rs = DBManager.querySQL("SELECT * FROM gongsi");
		try{
			while(rs.next()){
				GongSi gs=new GongSi();
				gs.setName(rs.getString(1));
				gs.setLogoimg(rs.getString(2));
				gs.setDizhi(rs.getString(3));
				gs.setPhone(rs.getString(4));
				gs.setEmail(rs.getString(5));
				gs.setJieshaoimg(rs.getString(6));
				gs.setJieshao(rs.getString(7));
				gs.setWenhuaimg(rs.getString(8));
				gs.setWenhua(rs.getString(9));
				gs.setRexian(rs.getString(10));
				gsl.add(gs);
				return gsl;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
