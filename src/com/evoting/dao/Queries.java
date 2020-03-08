package com.evoting.dao;

public interface Queries {
	String User_Login= "SELECT * FROM voterdetail WHERE VoterID=?";
	String User_Check="SELECT * from votecast where VoterID=?";
	String User_Cast="UPDATE votecast SET ecount='1' where VoterID=?";
	String Party_Count="UPDATE votecount SET vcount=? where partyid=?";
	String Get_Count="SELECT * FROM votecount where partyid=?";
	String Total_Vote="SELECT SUM(vcount) FROM votecount";
	String Result="SELECT partyname FROM votecount WHERE vcount IN (SELECT MAX(vcount) FROM votecount)";
	
}
