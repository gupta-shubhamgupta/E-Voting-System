package com.evoting.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbfactory {

	Connection con;
	public Connection getMySqlCon()
	{
		//This method is responsible to establish connection with database.
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evotingdb","root","root");
			
			if(con!=null)
			{
				con.setAutoCommit(false);
			}
		}catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		return con;
	}
}
