package Day5.jdbc;

// Displaying data from the Database table
import java.sql.*;
import java.io.*;
public class Jdbc12 
{
	public static void main(String[] args) throws IOException,SQLException,ClassNotFoundException
	{
		ResultSet rs;
		try
		{
			// load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// get connection object
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root14");
        System.out.println("---connected---");
	    Statement st=c1.createStatement();
        rs=st.executeQuery("select * from student123");
        System.out.println("Sno   Name Course FeePaid Date  Address     Phone");
      /*  while(rs.next())
      
        	System.out.println(rs.getInt(1)+"   "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getDate(5)+" "+rs.getString(6)+" "+rs.getLong(7));
       }*/
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getFloat(3));
        }
		}
     catch(Exception e){System.out.println("hello"+e);}	
  }
}