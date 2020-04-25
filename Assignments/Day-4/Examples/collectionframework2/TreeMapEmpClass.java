package Day4.collectionframework2;
import java.util.TreeMap;
class Employee implements Comparable<Employee>
{
	int empid;
	public Employee(int empid) {
		this.empid = empid;
	}
	public int compareTo(Employee arg0) {
		//System.out.println("im inside ccompareto");
		if(this.empid<arg0.empid)
		return 1;
		else
		return -1;
		//return -this.ename.compareTo(arg0.ename);
	}	
	public String toString()
	{
		return " "+this.empid;
	}
	@Override
	public int hashCode()
	{
		return this.empid;
	}
	@Override
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		return this.empid==e.empid;
	}
	}

public class TreeMapEmpClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Employee, String> tm=new TreeMap<Employee,String>();
Employee e3=new Employee(1998);
Employee e1=new Employee(1504);
Employee e2=new Employee(1505);
Employee e5=new Employee(1505);
//Employee e5=new Employee(1505);

tm.put(e1, "Maruthi");
tm.put(e2,"Jaanvika");
tm.put(e3,"Kusuma");
tm.put(e5, "Apple");
System.out.println(tm);

TreeMap<Integer, String> tm1=new TreeMap<Integer,String>();
tm1.put(1504, "Maruthi");
tm1.put(1505,"Jaanvika");
tm1.put(1998,"Kusuma");
tm1.put(1505, "Apple");
System.out.println(tm1);
  	}

}
