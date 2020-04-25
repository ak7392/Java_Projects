package Day5.jdbc;

// Inserting Data From Database Table
import java.sql.*;
public class Jdbc13MYSQL
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost/"+ "jdbcprog","root","root");
        System.out.println("---connected---");
		Statement st=c1.createStatement();
	        int i=st.executeUpdate("insert into student values('YYYY',88899)");
	        		//,8555)");
	      //  int j=st.executeUpdate("insert into student values(586,'yi',7000)");

        System.out.println("no of rows inserted\n"+i);
        //System.out.println("no of rows inserted\n"+j);
}
     catch(Exception e){System.out.println("hello"+e);}	
}
}

