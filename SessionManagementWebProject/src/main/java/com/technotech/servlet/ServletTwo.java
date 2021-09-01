package com.technotech.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/ServletTwo", "/Two" })
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "NA";
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("keyName")) {
				name = cookie.getValue();
			}
		}
		
		response.setContentType("text/html");
		String htmlResponse = "<html>"
				+ "<body><center>"
				+ "<h4>Welcome To Servlet One</h4>"
				+ "Name: " + name
				+ "</center></body>"
				+ "</html>";
		
		response.getWriter().println(htmlResponse);
	}

}
