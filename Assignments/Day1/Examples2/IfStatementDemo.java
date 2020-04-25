  
public class IfStatementDemo {
	static String s;
	
	static void isEligible(int age)
	{
		if(age<18)  // we are checking the age of the customer, who are more than 18 years  can get google account
		{
		System.out.println(s);
		System.out.println("you cant take account righ now");
		}
		else
		System.out.println(age+" Welcome to Google Services..\n"+ "click here to go inbox page");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		isEligible(age);
		
		
		if(age<18)
		{
		int x=67;
		}
		else
		System.out.println("hello");
	}
}