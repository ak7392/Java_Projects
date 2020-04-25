package Day2.oop;

public class Employee {
private int empid;
private float empsal;
private String ename;
public Employee(int empid,float empsal,String ename)
{
	this.empid = empid;
	this.empsal = empsal;
	this.ename =ename;
}
// we can initialize either using constructor or setters 
public int getEmpid() {
	return empid;
}
public float getEmpsal() {
	return empsal;
}
public String getEname() {
	return ename;
}
}

