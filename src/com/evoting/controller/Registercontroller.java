package com.evoting.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.evoting.dao.UserDAO;


/**
 * Servlet implementation class Registercontroller
 */
@WebServlet("/Registercontroller")
public class Registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String vid=request.getParameter("voterid");
		int voteid=Integer.parseInt(vid);
		long voterid=Long.parseLong(vid);
		UserDAO udo= new UserDAO();
		ArrayList<String> list1=new ArrayList<String>();
		
		boolean bool=udo.checkVID(voterid);
		list1 = (ArrayList<String>) udo.set(voteid);
		
		
		if(bool){
			
			session.setAttribute("vid", list1.get(0));
			session.setAttribute("name", list1.get(1));
			session.setAttribute("dob", list1.get(2));
			session.setAttribute("address", list1.get(3));
			session.setAttribute("dis", list1.get(4));
			session.setAttribute("state", list1.get(5));
			session.setAttribute("pin", list1.get(6));
			
			RequestDispatcher re=request.getRequestDispatcher("HomePage.jsp");
			re.forward(request, response);
		}
		else{
			request.setAttribute("psMsg", "Please enter valid voter id");
			RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}
	}

}
