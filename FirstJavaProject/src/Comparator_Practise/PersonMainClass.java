package Comparator_Practise;
import java.util.*;

public class PersonMainClass {
	public static void main(String args[]) {
		
		Person_Class person1 = new Person_Class(1, "NewPerson1");
		Person_Class person2 = new Person_Class(2, "NewPerson2");
		Person_Class person3 = new Person_Class(3, "NewPerson3");
		
		HashSet<Person_Class> tset = new HashSet<Person_Class>();
		tset.add(person1);
		tset.add(person2); 
		tset.add(person3); 
		
		Iterator it = tset.iterator();
		
		while(it.hasNext()) {
			Person_Class is = (Person_Class) it.next();
			System.out.println(is.getPersonId());
		}
		
		
	}
}
