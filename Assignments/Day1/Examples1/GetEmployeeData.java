package Database;
public class GetEmployeeData
{
int i;
 static void getEmpDetails(int empId)
{
	 System.out.println(" helli, i am from emp method");
	// no java code
	// to get database connection
	// check the avaibility of the record with empId
	// if avaiable get complete data of the emp
	// we display in a browser
}
  static void deleteEmp(int empid)
 {
	 System.out.println(" hello, im from other emp method");
 }
  
   public static void main(String abcd[])
   {
	   System.out.println("hello,I am from main method");
	   getEmpDetails(89);
	   deleteEmp(75);
	   
   }
  
}
