package Day5.jdbc;

import java.sql.*;  
import java.io.*;  
public class RetrieveImage {  
public static void main(String[] args) {  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
      
PreparedStatement ps=con.prepareStatement("select * from imgtable");  
ResultSet rs=ps.executeQuery();  
//boolean b1=rs.next();
if(rs.next()){//now on 1st row  
System.out.println("hello");
Blob b=rs.getBlob(2);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
              
FileOutputStream fout=new FileOutputStream("f:\\maruthi3.jpg");  
fout.write(barr);  
              
fout.close();  
}//end of if  
System.out.println("ok");  
              
con.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  