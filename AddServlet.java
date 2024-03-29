package kkkk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("add")
public class AddServlet extends HttpServlet
{	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	int i = Integer.parseInt(req.getParameter("num1"));
	int j =Integer.parseInt(req.getParameter("num2"));
	int k =i+j;
	out.println("result is "+k);
	
}}
	


