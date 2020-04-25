package PersonExample;

public class Student extends Person{
	
	final private String CLASS_STATUS;
	public Student(String name,String address,int phone_num,String email_addr ,String class_status){
		super(name, address, phone_num, email_addr);
		this.CLASS_STATUS = class_status;
	}
	
	
	public String getCLASS_STATUS() {
		return CLASS_STATUS;
	}


	public String toString(){
		return "\nClassStatusForStudent: " + getCLASS_STATUS();
	}
	

}
