package com.technotech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/ServletOne", "/One" })
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		System.out.println(">>> Name: " + name);
		
		response.setContentType("text/html");
//		String htmlResponse = "<html>"
//				+ "<body><center>"
//				+ "<h4>Welcome To Servlet One</h4>"
//				+ "<a href='home.jsp?name="+ name +"&age=21'>Enter Home</a>"
////				+ "<a href='Two?name="+ name +"&age=21'>Enter Home</a>"
//				+ "</center></body>"
//				+ "</html>";
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", 21);
		
		String htmlResponse = "<html>"
			+ "<body><center>"
			+ "<h4>Welcome To Servlet One</h4>"
			+ "<a href='home.jsp'>Enter Home</a>"
//			+ "<a href='Two'>Enter Home</a>"
			+ "</center></body>"
			+ "</html>";
		
		
//		Cookie cookie = new Cookie("keyName", name);
//		response.addCookie(cookie);
		
		PrintWriter out = response.getWriter();
		out.println(htmlResponse);
	}

}
