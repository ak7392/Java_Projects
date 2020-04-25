package PersonExample;

public class Person {
	
	protected String name;
	private String address;
	private int phone_num;
	private String email_addr;
	
	public Person(String name,String address,int phone_num,String email_addr){
		this.name = name;
		this.address = address;
		this.phone_num = phone_num;
		this.email_addr = email_addr;
				
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getPhone_num() {
		return phone_num;
	}	

	public String getEmail_addr() {
		return email_addr;
	}

	
	
	public String toString() {
		return "\nName: " + getName() + "\nAddress: " + getAddress()
				+ "\nPhoneNumber: " + getPhone_num() +
				"\nEmail_Address: " + getEmail_addr(); 
	}
}
