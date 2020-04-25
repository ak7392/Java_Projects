package Day4.collectionframework1;
/**
 * 
 * We must implement Comparable interface and override compareTo method
 */
public class Employee implements Comparable
{

	private int empId;
	private String empName;
	
	public Employee() {
		
	}
	
	public Employee(String empName,int empId) {
		this.empName = empName;
		this.empId=empId;
	}
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}

// e1.compareTo(e2);
	public int compareTo(Object o) {
		//System.out.println(this.empName);
		Employee o1=(Employee)o;
		return (this.empName.compareToIgnoreCase(o1.empName));
		//Employee o1=(Employee)o;
		//System.out.println(o1.empName);
		/*Employee o1=(Employee)o;
		if(this.empId<=o1.empId)
	return -155;
		else
			return 18889;*/
		//return -(this.empId-o.empId);
}
	 /*@Override
	public boolean equals(Object o)
	{
		 System.out.println("hello equals");
		Employee i=(Employee)o;
		boolean b=(this.empId==i.empId);
		//System.out.println(b);
		return b;
	}*/
	/*@Override
	public int hashCode()
	{
		System.out.println("calling hashcode method");
		return empId;
	} */
	@Override
	public String toString()
	{
		return empName+"="+empId;
	}
	

	
}
