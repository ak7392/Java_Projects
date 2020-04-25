package VariblesAps;

import java.util.Date;
class Student
{
	int rollno;
	String name;  // object level variables
	long phoneNumber;
	String emaild;
	Date dob;
	int count;
	static int no_of_students=20; // static variables or class level variables
	static String trainerName="Maruthi";
	final int x=123;
	public void getGrade(int rollno)
	{
		// we can data base connectoins, we retrive a student info from the database and we can display that info
		count++;
		//x++;
		//return;
		System.out.println(" he is a good student"+count);
		
	//	System.out.println(no_of_students);
	}

	public void getNo_of_students()  // it can access instance and static
	{
		int k=998797; // local variables
	//	System.out.println(" im from method ");
		no_of_students++; // ++ means incrementing by one
	//	System.out.println(k);
		System.out.println(no_of_students);
	}
	
	 public void getStudentDetails(int rollNumber) // object level operations
	 {
		 System.out.println("we will display about student object for given rollNumber");
	 }
	public static void getConnection() // it can access static variables only and doing some class level methods
	{
		 no_of_students++;
		/// System.out.println(rollno);
		//. ++;
		System.out.println(" return connection object ,so that you get connection"+no_of_students);
	//	System.out.println(rollno);
		///System.out.println(k);
	}
	public static void getTrainerDetails()
	{
		System.out.println("you can check in google");
	}
	public int testme()
	{
		return 23;
	}
}
public class InstanceVariablesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classname objectname = new classname();
Student s1=new Student(); // automaticaly all variabls gets iniatialized
System.out.println(s1.rollno);
System.out.println(s1.name);

s1.getGrade(234);  
s1.getGrade(255); // use object if the method is instance memthod
s1.getGrade(895);
System.out.println(s1.count);

s1.getNo_of_students();
s1.getNo_of_students();
s1.getNo_of_students();

System.out.println(Student.no_of_students);

/*Student.getNo_of_students();
Student.getNo_of_students();
Student.getNo_of_students(); // no_of_students
*/
Student s2=new Student(); // automaticaly all variabls gets iniatialized

System.out.println(s2.rollno);
System.out.println(s2.name);

System.out.println(s2.count);
System.out.println(Student.no_of_students);
s2.getGrade(234);
s2.getGrade(255);

s2.getNo_of_students();
s2.getNo_of_students();
s2.getNo_of_students();


System.out.println(s1.count);
System.out.println(s2.count);

System.out.println(Student.no_of_students);  // use class name to access static variables/methods
System.out.println(Student.no_of_students);

System.out.println(Math.sqrt(25));


int roll=s1.rollno;
Student.getConnection();
// you cancall a method, you can pass roll as a parameter to that method
	}

}
