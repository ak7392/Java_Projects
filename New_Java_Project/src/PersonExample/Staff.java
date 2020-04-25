package PersonExample;

public class Staff extends Employee{

	private String title;
	
	public Staff(String name,String address,int phone_num,String email_addr, String office, int salary, String title) {
		super(name, address, phone_num, email_addr,  office,  salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return "\nPersonname: " + super.name + "\nStaffTitle: " + getTitle();
	}
	
	

}
