package com.technotech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.technotech.dao.DB;
import com.technotech.model.User;


@WebServlet({ "/RegisterController", "/Register" })
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.name = request.getParameter("name");
		user.email = request.getParameter("email");
		user.password = request.getParameter("password");
		System.out.println(">>> User: " + user);
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		
		DB db = new DB();
		boolean result = db.register(user);
		
		if(result) {
			writer.println("User Register Successfully");
		} else {
			writer.println("OOPS!! Something Went Wrong...");	
		}
		
	}

}
