package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LiuYanDao;
import com.dao.impl.LiuYanDaoImpl;
import com.entity.LiuYan;
import com.util.DBManager;

public class MessageServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
//		ArrayList list=new ArrayList();
		String name = request.getParameter("username");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String liuyan = request.getParameter("liuyan");
		
		LiuYanDao lyd=new LiuYanDaoImpl();
		 List<LiuYan> ly=lyd.getLiuYan();
		 
		 int cd=ly.size()+1;
//		 for(int i=0;i<ly.size();i++){
//			 int s=i;
//		 }
//		ResultSet rs = DBManager.querySQL("SELECT id FROM liuyan ;");
//		try {
//			while(ly.next()){
//			rs.getString("id");
//			list.add(new String(rs.getString("id")));
//}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		lyd.addLiuYan("INSERT liuyan VALUES("+cd+",'" + name + "','"
//				+ tel + "','" + email + "','" + liuyan + "','Œ¥∂¡')");
		int n = DBManager.updateSQL("INSERT liuyan VALUES("+cd+",'" + name + "','"
				+ tel + "','" + email + "','" + liuyan + "','Œ¥∂¡')");
		if(n>0){
			System.out.println("¡Ù—‘≥…π¶!");
		}

	}
}
