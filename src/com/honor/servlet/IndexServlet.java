package com.honor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.honor.dao.GongShiDao;
import com.honor.dao.impl.GongShiDaoImpl;
import com.honor.entity.GongShi;

public class IndexServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		GongShiDao gsd = new GongShiDaoImpl();
		List<GongShi> gsList = gsd.queryGongShi();
		request.setAttribute("gs", gsList);
		request.getRequestDispatcher("/index.jsp").include(request, response);
	}

}
