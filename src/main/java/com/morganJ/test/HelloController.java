package com.morganJ.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest resquest, HttpServletResponse response)
	throws IOException {
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}
