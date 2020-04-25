package Day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MetaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		try
		{
			// load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// get connection object
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root13");
        System.out.println("---connected---");
	    Statement st=c1.createStatement();
        rs=st.executeQuery("select * from student123");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("Column in ResultSet:"+rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
		System.out.println("Column Name :"+rsmd.getColumnName(i));
		System.out.println("Column Type :"+rsmd.getColumnTypeName (i));
		// along with this data you can retrieve data from the table using resultset interface methods.
		}

		}
	     catch(Exception e){System.out.println("hello"+e);
	}
	}
}

