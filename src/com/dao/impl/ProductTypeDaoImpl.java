package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProductTypeDao;
import com.entity.ProductType;
import com.util.DBManager;

public class ProductTypeDaoImpl  implements ProductTypeDao {
	public List<ProductType> queryProductType() {
		List<ProductType> pts = new ArrayList<ProductType>();

		ResultSet rs = DBManager.querySQL("select * from chanpinleibie");

		try {

			while (rs.next()) {

				ProductType pt = new ProductType();
				pt.setId(rs.getInt(1));

				pt.setType(rs.getString(2));

				pts.add(pt);

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return pts;

		// TODO Auto-generated method stub

	}

}
