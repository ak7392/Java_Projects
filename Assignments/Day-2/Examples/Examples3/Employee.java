package VariblesAps;
// j ava bean pojo class
class Employee {
	// instance or static varibles
private int empid;
private String ename;
// constructors to initialize the objects

Employee(int e,String name) 
{
	empid=e;
	ename=name;
}

public int getEmpid() {
	return empid;
}

public String getEname() {
	return ename;
}

public void test()
{
	int x=34; // local variables
}

}