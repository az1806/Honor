package com.honor.dao.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.honor.dao.GongShiDao;
import com.honor.entity.GongShi;
import com.honor.util.DBManager;

public class GongShiDaoImpl implements GongShiDao{

	@Override
	public List<GongShi> queryGongShi() {
		// TODO Auto-generated method stub
		List<GongShi> gsList=new ArrayList<GongShi>();
		ResultSet rs = DBManager.querySQL("select * from gongsi ");
		try {
			while (rs.next()) {
				GongShi gs = new GongShi();

				gs.setName(rs.getString(1));
				gs.setDizhi(rs.getString(2));
				gs.setPhone(rs.getInt(3));
				gs.setEmail(rs.getString(4));
				gs.setJieshao(rs.getString(5));
				gs.setWenhua(rs.getString(6));
				gs.setRexian(rs.getString(7));
				gsList.add(gs);
			}

//			System.out.println("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gsList;
	}

}
