package VariblesAps;

public class TestEmployeeBean {

	public static void main(String[] args) {

Employee e2=new Employee(123,"Mar");

System.out.println(e2.getEname());
System.out.println(e2.getEmpid());

Employee e3=new Employee(456,"Shan"); // data we will get from form or from database 

System.out.println(e3.getEname());
System.out.println(e3.getEmpid());

	}

}
