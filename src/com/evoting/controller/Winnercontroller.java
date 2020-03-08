package com.evoting.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.evoting.dao.UserDAO;

/**
 * Servlet implementation class Winnercontroller
 */
@WebServlet("/Winnercontroller")
public class Winnercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		UserDAO udo= new UserDAO();
		boolean bool=udo.doneVoting();
		if(bool) {
			UserDAO udo1= new UserDAO();
			String winner=udo1.result();
			
			request.setAttribute("win", winner);
			RequestDispatcher re=request.getRequestDispatcher("HomePage.jsp");
			re.forward(request, response);
		}
		else {
			request.setAttribute("vMsg", "Voting is still in progress");
			RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
			rd.forward(request, response);
		}
		
	}

}
