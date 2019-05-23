package com.honor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.honor.util.DBManager;

public class MessageServvlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MessageServvlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

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

		String username=request.getParameter("username");
		String tel=request.getParameter("tel");
		String email=request.getParameter("email");
		String neirong=request.getParameter("neirong");
		int r=DBManager.updateSQL("inster liuyandb values(3,"+username+","+tel+","+email+","+neirong+");");
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username=request.getParameter("username");
		System.out.println(username);
		String tel=request.getParameter("tel");
		System.out.println(tel);
		String email=request.getParameter("email");
		System.out.println(email);
		String neirong=request.getParameter("neirong");
		System.out.println(neirong);
		int r=DBManager.updateSQL("inster into liuyandb values(3,'"+username+"','"+tel+"','"+email+"','"+neirong+"');");
		if(r>0){
			 request.getRequestDispatcher("/success").forward(request, response);
		}else{
            response.sendRedirect("/fail");//密码错误,重定向到失败页面
        }
	}

}
