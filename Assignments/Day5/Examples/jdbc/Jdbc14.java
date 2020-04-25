package Day5.jdbc;
// Updating data in Database Table
import java.sql.*;
public class Jdbc14
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root13");
        System.out.println("---connected---");
		Statement st=c1.createStatement();
        int i=st.executeUpdate("update student123 set feepaid=200 where sid=542");
        System.out.println("no of rows updated\n"+i);
}
     catch(Exception e){System.out.println("hello"+e);}	
	}
}

