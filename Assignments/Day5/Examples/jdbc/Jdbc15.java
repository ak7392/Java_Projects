package Day5.jdbc;
// Deleting data in Database Table
import java.sql.*;
public class Jdbc15
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root13");
        System.out.println("---connected---");
	    Statement st=c1.createStatement();
       int i=st.executeUpdate("delete from student123 where sid=542");
       System.out.println("no of rows deleted"+i);
      }
       catch(Exception e){System.out.println("hello"+e);}
    }
}

