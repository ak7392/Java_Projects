package Day5.jdbc;
import java.sql.*;  
import java.util.Scanner;  
class RS{  
public static void main(String iii[])throws Exception{
	String answer;
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root14");  
con.setAutoCommit(false);  // disablig auto comming mode 
System.out.println("connected database");
PreparedStatement ps=con.prepareStatement("insert into emp30 values(?,?,?)");  
   Scanner sc=new Scanner(System.in);
do{  
System.out.println("enter id:");  
int id=sc.nextInt();
System.out.println("enter name:");  
String name=sc.next();  
System.out.println("enter salary:");  
float salary=sc.nextFloat();
  
ps.setInt(1,id);  
ps.setString(2,name);  
ps.setFloat(3,salary); 

int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
System.out.println("you want to commit/rollback");
answer =sc.next();
if(answer.equals("commit")){
con.commit();
}
if(answer.equals("rollback")){
con.rollback();
}

System.out.println("Do you want to add one more record of Employee: y/n");  
String s=sc.next();  
if(s.startsWith("n")){  
break;  
}  
}while(true);  

//con.commit();
  con.close(); 

}}  