package com.morganJ.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class ServletTest09 extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String introduction = request.getParameter("introduction");
		
		out.println("<html><head><title>입사 지원</title></head>");
		out.println("<body>");
		out.println("<h1>" + name + "님 지원이 완료 되었습니다. </h1> <hr>");
		out.println("지원내용 <br>" + introduction);
		out.println("</body> </html>");
		
	}

}
