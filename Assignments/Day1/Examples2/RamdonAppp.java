  
import java.util.*;// we can also import user defind packages 
class Customer
{
	// fields
	// methods
	int accountNumber=2345;
	public int withdraw()
	{
	System.out.println("you can withdraw some funds");	
	return 100;
	}
	public void deposit()
	{
		System.out.println("you can deposit some amount");
	}
	public static void getData()
	{
		System.out.println("its a static method");
	}
}
public class RamdonAppp {
	String fname,lname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random r=new Random(); // r is a object of Random class
	
		int x=r.nextInt(10000000); // 0 to 100000 // its a variable of int type
		System.out.println("The randomly generated value is: " +x);		

		
		double d=Math.random(); // d is a variable of double type
		System.out.println(d);

		int d1=(int) (d*10000);  // d1 is a variable of int type
		
		System.out.println(d1);
	
		
		Customer c1=new Customer();
		int c=c1.withdraw();
		System.out.println(c1.accountNumber);
		System.out.println(c);
		c1.deposit();
		System.out.println(c1.accountNumber);
		System.out.println("The random vlaue from math class ranom method is: "+(long)(Math.random()*1000000000));
		
		Customer.getData();
		
		System.out.println("please enter any numbner");
		Scanner sc=new Scanner(System.in);
	int x1=sc.nextInt();
	
	if(x1%2==0)
	System.out.println("its even");
	if(x1%2!=0)
		System.out.println("its odd");
	else
		System.out.println("got it");
sc.close();

Date d4=new Date();
System.out.println(d4);// we can customize it
System.out.println(d4.getYear());
	}
	
}
