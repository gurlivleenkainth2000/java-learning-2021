package com.technotech.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.technotech.dao.DB;
import com.technotech.model.User;

@WebServlet({ "/RegisterController", "/register" })
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Map<String, String> msgMap = new HashMap<String, String>();
		if (email.isEmpty() || password.isEmpty()) {
			msgMap.put("status", "error");
			msgMap.put("message", "Email or Password Field is empty");
			msgMap.put("alertClass", "alert-danger");
			return;
		}
		
		if(!password.isEmpty()) {
			if(password.length() < 6) {
				msgMap.put("status", "error");
				msgMap.put("message", "Minimum 6 Characters");
				msgMap.put("alertClass", "alert-danger");
				
				return;
			}
			if(password.length() > 12) {
				msgMap.put("status", "error");
				msgMap.put("message", "Maximum 12 Characters");
				msgMap.put("alertClass", "alert-danger");
				return;
			}
		}
		
		User user = new User();
		user.name = name;
		user.email = email;
		user.password = password;
		
		DB db = new DB();
		user = db.userRegister(user);
		
		if(user != null) {
			msgMap.put("status", "success");
			msgMap.put("message", "Register Successfull");
			msgMap.put("alertClass", "text-success");
		} else {
			msgMap.put("status", "error");
			msgMap.put("message", "Registeration Failed");
			msgMap.put("alertClass", "text-danger");
		}
		
		request.setAttribute("message", msgMap);		
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

}

