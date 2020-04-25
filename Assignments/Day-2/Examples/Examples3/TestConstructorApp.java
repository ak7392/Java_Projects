package VariblesAps;
class StudentApp
{
	int rollNumber;// instance variables
	String name;

	static String trainerName="Maruthi";
	static int numberOfStudents;
	
	StudentApp(int r,String n)
	{
		System.out.println(" executing constructor automaticaly while creating object");
		rollNumber=r;
		name = n;
	}
	StudentApp(int r) {
		// TODO Auto-generated constructor stub
		rollNumber=r;
		// we can have database connection and try get name of student for given roll numbner
		name="sai";
	}
	// methods
	void getValue()	{
		int i=(int)Math.random();
		System.out.println(" calling a method");
		int k=8767; // local variables, life time is only inside the methods.
		//return i;
	}
	void one()
	{
	//	System.out.println(k);
	}
}
public class TestConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentApp o=new StudentApp(123,"Mar");
		//o.getValue();
		System.out.println(o.rollNumber);
		System.out.println(o.name);
		
		
		StudentApp o1=new StudentApp(456,"Raj");
		System.out.println(o1.rollNumber);
		System.out.println(o1.name);
		
		System.out.println(StudentApp.trainerName);
		StudentApp o2=new StudentApp(896);
		
	}

}
