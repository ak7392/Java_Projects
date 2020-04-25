package CollectionFrameworkDemo;
import java.util.TreeMap;
class Employee implements Comparable<Employee>
{
	int empid;
	String ename;
	public Employee(int empid) {
		this.empid = empid;
	}
	public int compareTo(Employee arg0) {
		if(this.empid<arg0.empid)
		return 1;
		else
		return -1;
	}	
	public String toString()
	{
		return "  "+this.empid;
	}
	public int hashCode()
	{
		return this.empid;
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		return this.empid==e.empid;
	}
	}
public class TreeMapEmpClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Employee, Float> tm=new TreeMap<Employee,Float>();
Employee e3=new Employee(1998);
Employee e1=new Employee(1504);
Employee e2=new Employee(1505);
tm.put(e1, 3434.09f);
tm.put(e2,783243.06f);
tm.put(e3,243.06f);
System.out.println(tm);
 	}

}
