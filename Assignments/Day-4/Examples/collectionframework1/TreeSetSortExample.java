package Day4.collectionframework1;
import java.util.*;
public class TreeSetSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Employee> ts=new TreeSet<Employee>();
Employee e0=new Employee("Maruthi",1405);
ts.add(e0);
Employee e1=new Employee("Jaanvi",568);
ts.add(e1);
// e0.compareTo(e1);
ts.add(new Employee("Shan",23423));
ts.add(new Employee("Kusuma",78));
ts.add(new Employee("Ramm",7544));

ts.add(new Employee("Rams",7544));

ts.add(new Employee("Kusuma",78));

System.out.println(ts);
	}

}
