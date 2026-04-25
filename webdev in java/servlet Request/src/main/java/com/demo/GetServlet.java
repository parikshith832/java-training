package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getDemo")
public class GetServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name=request.getParameter("username");
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
			out.println("<h2>Get Request</h2>");
			out.println("Welcome "+name);
		}
		

}
