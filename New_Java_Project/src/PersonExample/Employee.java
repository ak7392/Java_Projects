package PersonExample;
import java.util.Date;

public class Employee extends Person{
	private String office;
	private int salary;
	private Date date_hired;
	
	
	
	public Employee(String name,String address,int phone_num,String email_addr, String office, int salary){
		super(name, address, phone_num, email_addr);
		this.office = office;
		this.salary = salary;
		this.date_hired = new Date();
	}

	public String getOffice() {
		return office;
	}

	public int getSalary() {
		return salary;
	}

	public Date getDate_hired() {
		return date_hired;
	}
	
	public String toString() {
		return "\nPersonName" + super.getName() + "\nEmployeeOffice" + getOffice() + "\nEmployeeSalary" +
				getSalary() + "\nEmployeeHireDate" +
				getDate_hired();
	}
	

}
