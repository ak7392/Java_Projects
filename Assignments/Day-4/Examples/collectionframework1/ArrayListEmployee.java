package Day4.collectionframework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> list1=new ArrayList<Employee>();
list1.add(new Employee("maruthi",123));
list1.add(new Employee("aaj",128553));
list1.add(new Employee("ramya",78));
list1.add(new Employee("jaanu",789));
list1.add(new Employee("Ram",74));
list1.add(new Employee("zai",733));
list1.add(new Employee("Jai",733));

Iterator it1 = list1.iterator();
while(it1.hasNext())
{
	Employee e  = (Employee) it1.next();
	if(e.getEmpId()>=100)
		System.out.println(e);
}
System.out.println(list1);
Collections.sort(list1);
System.out.println(list1);
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(12);
list.add(90);
list.add(888);
list.add(22);
list.add(1);
list.add(744);
Collections.sort(list);
System.out.println(list);

Iterator<Employee> itr= list1.iterator();
Employee e=null;
while(itr.hasNext())
{
	Employee s = itr.next();
	System.out.println(s);
	if(s.getEmpName().equals("jaanu"))
		itr.remove();
}
System.out.println(list1);

	}

}
