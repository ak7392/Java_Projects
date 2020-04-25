package PersonExample;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Abhinav", "548 79th Street",9, "abhi7357@nyu.edu");
		System.out.println(p.toString());
		
		Student s= new Student("Abhinav", "548 79th Street",9, "abhi7357@nyu.edu","Freshman");
		System.out.println(s.toString());
		
		Employee e= new Employee("Abhinav", "548 79th Street",9, "abhi7357@nyu.edu","New York Bayridge", 780);
		System.out.println(e.toString());
		
		Faculty f= new Faculty("Abhinav", "548 79th Street",9, "abhi7357@nyu.edu","New York Bayridge", 780, "4-6 pm","Software Developer");
		System.out.println(f.toString());
		
		
		Staff st= new Staff("Abhinav", "548 79th Street",9, "abhi7357@nyu.edu","New York Bayridge", 780, "Principal Consultant");
		System.out.println(st.toString());
		
		
		
	}

}
