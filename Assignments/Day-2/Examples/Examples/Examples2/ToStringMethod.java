package ObjectClass;
class Student {
	String name;
	int rollno;
	//byte b=858;
	Student(String n, int r) 
	{
		// TODO Auto-generated constructor stub
		name = n;
		rollno = r;
	}
	// overriding parent class method, toString() from object class
	public String toString() 
	{
		return "Student Name: " +name + " Rollno is: " + rollno;
	}
	 public int hashCode() 
	{
		return rollno;
	}
				
		public boolean equals(Object obj)
		{	
			Student s1 =  (Student) obj;
			String name1 = s1.name;
			int rn1 = s1.rollno;
			String name2 = this.name;
			int rn2 = this.rollno;
			
			// System.out.println(name1.length());
			if ((name1.equals(name2)) && (rn1 == rn2))
				return true;
			else
				return false;
		}

	public void test(Object o) {
		System.out.println("a methods");
	}
	/*public void wait(long timeout)
	{
		
	}*/
}
class ToStringMethod  // test class
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("shiva", 25524);
		System.out.println(s1);   // JVM calls string representation of given
								    // object by calling toString()metho
		
		
		Student s2 = new Student("ram", 2524);
		System.out.println(s2);
		
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
						// System.out.println(s2);
		// System.out.println(s1.hashCode());
			Student s5 = new Student("abc", 234);
			Student s6 = new Student("abc", 234);
			Student s7 = new Student("a", 24);
	
		System.out.println(s5.equals(s6));// equals method of object class
	
		Student s8 = s7;
	
		System.out.println(s6.equals(s7));
	
	//	System.out.println(s1.equals("hello"));
	//	
	//	Student s9=null;
		//System.out.println(s1.equals(s9));
		
		
		
		//System.out.println(s1.equals("hello"));
		// Integer i=new Integer(10);
		// //int i;
		// s1.test(i);
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
	}

}
