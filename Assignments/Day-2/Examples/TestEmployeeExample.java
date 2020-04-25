package Day2.oop;

public class TestEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,12.12f,"ABC");
		//e.ename="Maruthi";
		System.out.println(e.getEname());
		Employee emp[]=new Employee[10];
		
		emp[0]=new Employee(2,23.23f,"R");
		emp[1]=new Employee(2,23.23f,"R");
		emp[2]=new Employee(2,23.23f,"R");
		emp[3]=new Employee(2,23.23f,"R");
		emp[4]=new Employee(2,23.23f,"R");
	}

}
