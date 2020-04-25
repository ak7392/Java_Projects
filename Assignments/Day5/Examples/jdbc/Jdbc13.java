package Day5.jdbc;
// Inserting Data From Database Table
import java.sql.*;
import java.util.Scanner;
public class Jdbc13
{
	public static void main(String[] args) throws SQLException 
	{
		Connection c1=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver"); // load the driver
		// getting connection using getconnection() method url,host,port,sid,username and password
		 c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root13");
        System.out.println("---connected---");
		Statement st=c1.createStatement();
		// read the form
        int i=st.executeUpdate("insert into student123 values(8888,'Mar123',52)");
        System.out.println("no of rows inserted\n"+i);
    
/*        PreparedStatement ps=c1.prepareStatement("insert into student123 values(?,?,?)");  
        Scanner sc=new Scanner(System.in);
   
     System.out.println("enter id:");  
     int id=sc.nextInt();
     System.out.println("enter name:");  
     String name=sc.next();  
     System.out.println("enter feepaid:");  
     float feepaid=sc.nextFloat();
       
     ps.setInt(1,id);  
     ps.setString(2,name);  
     ps.setFloat(3,feepaid); 

    int i=ps.executeUpdate();  
     System.out.println("number of records inserted "+i);
*/
		}
     catch(Exception e){
    	 System.out.println("hello"+e);
     c1.close();
     }
	
}
}

