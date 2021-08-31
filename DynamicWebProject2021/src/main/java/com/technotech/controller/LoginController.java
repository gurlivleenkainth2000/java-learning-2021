package com.technotech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.technotech.model.User;

@WebServlet({ "/LoginController", "/Login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("[LoginController] - init executed");
		
	}

	public void destroy() {
		System.out.println("[LoginController] - destroy executed");
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginController] - service executed");
		
		User user = new User();
		user.email = request.getParameter("email");
		user.password = request.getParameter("password");
		System.out.println(">>> User: " + user);
		
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		String message = "Thank You " + user.email;
		
		printWriter.println(message);
		
	}

}
