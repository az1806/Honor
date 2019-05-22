package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ManagerDao;
import com.dao.impl.ManagerDaoImpl;
import com.entity.Manager;

public class LoginServlet extends HttpServlet {

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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		
		ManagerDao ud = (ManagerDao) new ManagerDaoImpl();
		Manager manager = ud.queryManager();

		if (manager != null && manager.getName().equals(name)&&manager.getMiMa().equals(pwd)) { //登录成功
			HttpSession session = request.getSession();
			session.setAttribute("username", name);// session存放数据
			session.setAttribute("password", pwd);
			request.getRequestDispatcher("/IS").forward(request, response);
			
		}else {
			System.out.println("错误");
		}			
		
	}
}
