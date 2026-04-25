package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

@WebServlet("/putDemo")
public class PutServlet extends HttpServlet {
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader reader=request.getReader();
		String data=reader.readLine();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Put Request recieved " + data);
	}
}
