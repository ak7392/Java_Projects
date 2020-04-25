package Day4.collectionframework1;
import java.util.*;
class Employee
{
	int eexp;
	float esal;
	String ename;
	public Employee(int eexp,float esal,String ename) {
		
		this.eexp=eexp;
		this.esal=esal;
		this.ename=ename;
	}
	public int getEexp() {
		return eexp;
	}
	public void setEexp(int eexp) {
		this.eexp = eexp;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+this.eexp+ ":" + this.esal+" : "+this.ename;
	}
}
public class TestCursors {

	public static void main(String[] args) {
ArrayList<Employee> al=new ArrayList<Employee>();
System.out.println(al.add(new Employee(3,12.34f,"Maruthi")));
al.add(new Employee(6,16.34f,"Raj"));
al.add(new Employee(13,15.34f,"Ram"));
al.add(new Employee(13,17.34f,"Jaanu"));
al.add(new Employee(30,15.34f,"Kusu"));
System.out.println(al);
/*Iterator<Employee> i=al.iterator();
while(i.hasNext())
{
	Employee e=(Employee)i.next();
	if(e.getEexp()>10)
	e.setEsal(e.getEsal()+10);
	else
	i.remove();
}
System.out.println(al);
*/
for(int j=0;j<al.size();j++)
{
	Employee e=al.get(j);
	System.out.println(e);
	if(e.getEexp()>10)
	e.setEsal(e.getEsal()+10);	
	else
	al.remove(j);
}
System.out.println(al);
	}

}
