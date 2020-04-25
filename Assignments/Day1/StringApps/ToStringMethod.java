package StringApps;

class Student
{
	String name;
	int rollno;
	public Student(String na,int r) {
		// TODO Auto-generated constructor stub
	this.name=na;
	this.rollno=r;
	}/*
	public String toString()
	{
		return "Student Name: "+name+" Rollno is: "+rollno ;
	}
	public int hashCode()
	{
		return rollno;
	}*/
	@Override
	public boolean equals(Object o)
	{
		try
		{
		Student s2=(Student) o;
	
	String name1=s2.name;
	int rn1=s2.rollno;
	String name2=this.name;
	int rn2=this.rollno;
	//System.out.println(name1.length());
	if((name1.equals(name2)) && (rn1==rn2))
	return true;
	else
		return false;
	}
	catch(NullPointerException ap)  // | ClassCastException ap)
	{
		System.out.println("inside catch block");
		return false;
	}
	catch(ClassCastException c){

		System.out.println("class cast exception inside catch block");
		return false;
	}
	}
	public void test(Object o)
	{
		
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Student s1=new Student("shiva",25524);
		//System.out.println(s1);// JVM calls string representation of given object by calling toString()method
		Student s2=new Student("ram",2524);
		//System.out.println(s2);
		/*System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		Student s5=new Student("abc",234);
		Student s6=new Student("abc",234);
		Student s7=new Student("a",24);
		System.out.println(s5.equals(s6));
		Student s8=s7;
		System.out.println(s8.equals(s7));
		*/
		
		System.out.println(s1.equals("hello"));
		Integer i=new Integer(10);
		//int i;
		s1.test(i);
	}

}
