package Day5.jdbc;


import java.sql.*;
public class Jdbc11
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
			// step1: load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// register the driver using dm or creating connection object
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root14");
        System.out.println("---connected---");
	    // creating statement object
		Statement st=c1.createStatement();
		// executing query
       st.executeUpdate("create table student007(sno number(10),sname varchar2(20),sfee number(6,2))");
       System.out.println("Table is Created");
	   c1.close();
      }
       catch(Exception e){System.out.println("hello"+e);}
    }
}

