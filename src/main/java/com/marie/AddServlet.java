package com.marie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
	
		int k = i + j;
		System.out.println(k);
		
		//url rewriting, session, cookies
//		HttpSession session= req.getSession();
//		session.setAttribute("k", k);
		
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
//		req.setAttribute("k", k);
//		2 ways to call another servlet: req dispatch & redirecting
//		-> dispatch (second servlet url is hidden)
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		//->redirection url is shown
//		res.sendRedirect("sq?k=" + k); //URL rewriting
		
	}

}
