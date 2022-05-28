package com.marie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int k = 0;
		//		int k = (int) req.getAttribute("k"); //dispatch
	
//		int k = Integer.parseInt(req.getParameter("k")); //redirect(rewriting)
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		k = k * k;
		Cookie[] cookies = req.getCookies();	
		for(Cookie c: cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		System.out.println("sq called");
	}
}
