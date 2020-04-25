package PersonExample;

public class Faculty extends Employee {

	private String office_hours;
	private String rank;
	
	public Faculty(String name,String address,int phone_num,String email_addr, String office, int salary, String office_hours, String rank) {
		super(name, address, phone_num, email_addr,  office,  salary);
		this.office_hours = office_hours;
		this.rank = rank;	
	}

	public String getOffice_hours() {
		return office_hours;
	}

	public String getRank() {
		return rank;
	}

	public String toString() {
		return "\nPersonName: " + super.name + "\nFacultyOfficeHours: " + getOffice_hours()+
				"\nFacultyRank: " + rank ;
	}
	
	
	
}
