package Day5.jdbc;
/*// create a table in db
 * CREATE TABLE  "IMGTABLE"   
(    "NAME" VARCHAR2(4000),   
 "PHOTO" BLOB  
) */ 
import java.sql.*;  
import java.io.*;  
public class InsertImage {  
public static void main(String[] args) {  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"Raj");  
  
FileInputStream fin=new FileInputStream("f:\\Maruthi1.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  