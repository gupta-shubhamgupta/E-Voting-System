package com.evoting.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.evoting.dao.UserDAO;

/**
 * Servlet implementation class Votecount
 */
@WebServlet("/Votecount")
public class Votecount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String partyname=request.getParameter("uu");
		int partyid=Integer.parseInt(partyname);
		
		String vid=(String)session.getAttribute("coi1");
		
		int vid1=Integer.parseInt(vid);
		UserDAO dao=new UserDAO();
		boolean bool=dao.checkVoterDone(vid1);
		
		if(bool) {
			UserDAO dao1=new UserDAO();
			UserDAO dao2=new UserDAO();
			dao1.updateCast(vid1);
			dao2.partyCount(partyid);
			
			request.setAttribute("Msg", "Voter has voted successfully");
			RequestDispatcher re=request.getRequestDispatcher("HomePage.jsp");
			re.forward(request, response);
		}
		else {
			request.setAttribute("pMsg", "Voter already cast their vote");
			RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
