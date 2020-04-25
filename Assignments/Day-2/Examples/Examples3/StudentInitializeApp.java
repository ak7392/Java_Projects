package VariblesAps;
class Student123
{
	private int rollno;
	private String name;
	private static String course="Java";
	private static String trainer="Maruthi";
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public static String getCourse() {
		return course;
	}

	public static String getTrainer() {
		return trainer;
	}

	Student123(int r,String n)  // parameterized constructor to initiaze the variables of this object
	{
		// want to initialize my object using constructors
		System.out.println("calling constructors here......");
		rollno=r;
		name=n;
		// this is refer to instance variables
		//Student123.x=45;
		/*rollno=r;
		name=n;*/
		
	}
	Student123() // default constructor, dont have any parameters
	{
		this.rollno=9999999;
		this.name="Lucky";
	}
	Student123(int rollno)
	{
		//this(589,"Ram");// to invoke a constructor in this class, where no parameters
		this.rollno=rollno;
		// data connection and getting more info about the student whose rolll number is rollno
	}
	Student123(String name)
	{
		this.rollno=34556; // we wil have some database connection, 
		this.name=name;
	}
	 
	void displayStudent()
	{
		int x=34;  // local variables
		System.out.println("rollNumber is: "+this.rollno);
		System.out.println("Name of the student: "+this.name);
		System.out.println("The course is: "+Student123.course);
		System.out.println("The trainer name is :"+Student123.trainer);
	}
	 void getStudentDetails(int rollno)
	{
		// java statements
	}
	static void getTrainerDetails()
	{
		// java statements
		System.out.println("Java Trainer");
	}
	
	 
}
public class StudentInitializeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student123 s1=new Student123(123,"Mar"); // to initialize s1 object using constructors
System.out.println(s1.getRollno());
System.out.println(s1.getName());

Student123 s2=new Student123(895,"Mar12");
System.out.println(s2.getRollno());
System.out.println(s2.getName());

s1.displayStudent();
s2.displayStudent();	

Student123.getTrainerDetails();

/*Student123 s3=new Student123();// of default constructor in student
System.out.println(s3.rollno);
System.out.println(s3.name);
s3.displayStudent();

Student123 S8=new Student123("Janu");
Student123 S9=new Student123(123);

Student123 s90 = new Student123();*/
//System.out.println(s1.x);
	}
}
