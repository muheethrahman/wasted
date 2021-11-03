package com.client.clientApp.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class RegisterServerlet extends GenericServlet {

	@Override
	public void service(ServletRequest reg, ServletResponse res) throws ServletException, IOException {
		String name=reg.getParameter("userName");
		String mobileno=reg.getParameter("mobileno");
		String age=reg.getParameter("age");
		String email=reg.getParameter("email");
		

PrintWriter printWriter=res.getWriter();
res.setContentType("text/html");
printWriter.print("thank you"+ name);
		

	}

}
