# E-Voting-System

					E-Voting System

1.	Technology used to create E-Voting System Project.
J2EE, MySQL, CSS, JSP, Apache Tomcat 9

2.	Following are the assumption that I had in my mind while making this project.
a.)  With the help of voter ID, a person can login to the website.
b.) There are 5 voters and 2 political parties in voterdetail and votecount table respectively      in the database named eVotingDB.
c.) There is 1 more table called votecast which prevents voters from voting more than once.
d.) The result will be displayed only when all the 5 voters cast their votes.

3.	You need to create database and corresponding tables in your database in my case it is MySQL below are the query you just need to paste in your database.
a.)	create database eVotingDB;

b.)	CREATE TABLE voterDetail (VoterID int NOT NULL,Name varchar(255) NOT NULL,DOB varchar(255) NOT NULL,Address varchar(255) NOT NULL,District varchar(255) NOT NULL,State varchar(255) NOT NULL,PinCode int NOT NULL, PRIMARY KEY (VoterID));

c.)	CREATE TABLE votecast (eCount int NOT NULL ,VoterID int NOT NULL,FOREIGN KEY (VoterID) REFERENCES voterDetail(VoterID));

d.)	CREATE TABLE votecount (PartyName varchar(255) NOT NULL ,vCount int NOT NULL, partyid int NOT NULL);

e.)	INSERT INTO voterDetail VALUES(2345167,'Vignesh Narendra','1997-02-21','23/A Sahapur colony','Kolkata','West Bengal',700156),(2312378,'Arvind Rena','1996-01-22','Allenby Rd, Opposite Forum Shopping Mall','Kolkata','West Bengal',700156),(2312341,'Kunal Singh','1993-04-12','Phool Bagan CIT Road Phool Bagan','Kolkata','West Bengal',700156),(4562341,'Ashish Gupta','1991-06-18','Allenby Road, Karunamoyee Ghat Rd','Kolkata','West Bengal',700156),(4598741,'Arpita Singh','1994-01-28','Motilal Gupta Rd, Raja Ram Mohan Roay','Kolkata','West Bengal',700156);

f.)	INSERT INTO voteCount VALUES(0,2345167),(0,2312378),
(0,2312341),(0,4562341),(0,4598741);  

g.)	INSERT INTO votecount VALUES('BJP',0),('Congress',0);

4.	 To run the project first extract all the file from EVoting.zip and import it in eclipse. Run Register.jsp page using apache tomcat then you will get link http://localhost:8081/EVoting/Register.jsp (Your port number might be different, make changes accordingly) and paste link into chrome browser to get expected results.
