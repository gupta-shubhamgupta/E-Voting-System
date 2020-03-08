package com.evoting.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.evoting.util.Dbfactory;



public class UserDAO {
	
	Dbfactory db;
	Connection con;
	PreparedStatement ps;
	
	public UserDAO()
	{
		db=new Dbfactory();
		con=db.getMySqlCon();
	}
	
	public boolean checkVID(long vid)
	{
		//The checkVID check whether voter is exist is database or not and return true if it is present or else return false to Registercontroller.
		boolean bool=false;
		try
		{
			ps=con.prepareStatement(Queries.User_Login);
			ps.setLong(1, vid);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				
				bool=true;
				
				return bool;
			}
		}catch(SQLException e){
			System.out.println(e);
		}
		return bool;
	}
	public List<String> set(int vid) {
		//The set() will get all the data related to voter from database and save into list and return list to Registercontroller.
		ArrayList<String> list=new ArrayList<String>();
		try
		{
			ps=con.prepareStatement(Queries.User_Login);
			ps.setLong(1, vid);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				list.add(String.valueOf(rs.getInt(1)));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
				list.add(rs.getString(4));
				list.add(rs.getString(5));
				list.add(rs.getString(6));
				list.add(String.valueOf(rs.getInt(7)));
				
			}
			
		}catch(SQLException e){
			System.out.println(e);
		}
		return list;
	}
	
	public boolean checkVoterDone(int vid) {
		//the checkVoterDone() method check whether voter is attempting first time or voter is trying to cast vote multiple time return boolean to Votecount servlet.
		boolean bool=false;
		int count=1;
		try
		{
			ps=con.prepareStatement(Queries.User_Check);
			ps.setLong(1, vid);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				 count=rs.getInt(1);
			}
			
			if(count==0)
			{
				bool=true;
				return bool;
			}
		}catch(SQLException e){
			System.out.println(e);
		}
		return bool;
	}
	
	public void updateCast(int vid) {
		//This method update in database that voter done their voting.
		try
		{
			ps=con.prepareStatement(Queries.User_Cast);
			ps.setInt(1, vid);
			
			 ps.executeUpdate();
			 con.commit();
			
			
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	public void partyCount(int partyid) {
		//This method update the count of vote corresponding to political party.
		try
		{
			
			ps=con.prepareStatement(Queries.Get_Count);
			ps.setInt(1, partyid);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			int vcount=rs.getInt(2);
			vcount=vcount+1;
			
			ps=con.prepareStatement(Queries.Party_Count);
			ps.setInt(1, vcount);
			ps.setInt(2, partyid);
			ps.executeUpdate();
			con.commit();
			}
			
		}catch(SQLException e){
			System.out.println(e);
		}
	}
	public boolean doneVoting() {
		//This method give information that voting is now completed.
		boolean bool=false;
		try
		{
			
			ps=con.prepareStatement(Queries.Total_Vote);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			int vcount=rs.getInt(1);
			System.out.println(vcount);
			if(vcount==5) {
				bool=true;
				return bool;
				}
			con.commit();
			}
		}
			
		catch(SQLException e){
			System.out.println(e);
		}
		return bool;
	}
	
	public String result() { 
		//This method give information which poltical party won the election.
		String winner=null;
		try
		{
			
			ps=con.prepareStatement(Queries.Result);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			 winner=rs.getString(1);
			
			con.commit();
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return winner;
	}
}
