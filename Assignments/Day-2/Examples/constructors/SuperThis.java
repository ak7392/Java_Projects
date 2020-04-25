package Day2.constructors;
class A1
{
	int i=123;
	public A1() {
System.out.println("its a parent default constructor");
}
	public A1(int x) {
		System.out.println("its a parent parameterized constructor");
	}}
class B extends A1
{
	int i = 345;
public B() {
	// in every chaild class construcotr, there is super() by default, if you dont specify either super or this
	System.out.println("its a chaild default constructor"); }	
public B(String s) {
	this(); // either super or this, but not both, either user specific this or super of defualt super
	System.out.println("its a chaild  parameterized constructor"); }	
public void getValue()
{
	System.out.println("the value of "+super.i); 
}
}
class Student1
{
	int rNum; // instance variables
	String name;
	static String trainerName="Maruthi";
	public Student1(int rNum,String name) // its highly to give same name here and instance
	{
		this.rNum = rNum; // we refer the current object using this keyword
		this.name = name;
	}
	public void getStudentDetails()
	{
		System.out.println("name is : "+name);
		System.out.println("roll number is "+rNum);
	}
	public void getRank()
	{
	// object to object it will give different result 	
	}
	public static void getCourseDetails()
	{
		// it will give same result for every object, we can use class name to invoke static methods
	}
}
	

public class SuperThis {
public static void main(String[] args) {
	B b = new B("Maruthi");
	b.getValue(); 
	Student1 s=  new Student1(120, "Mar");
	s.getStudentDetails();
	Student1.getCourseDetails();
	s.getRank();
	
}}
