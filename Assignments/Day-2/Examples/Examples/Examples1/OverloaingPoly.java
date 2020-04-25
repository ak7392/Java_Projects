class Bank 
{
	private String name;
	int bankId;
	String type;
	final int i=345;
	public Bank() {
		// TODO Auto-generated constructor stub 
		}
	public Bank(String name,int bankId,String type) {
		this.name  = name;
		this.bankId=bankId;
		this.type=type;
	}
	void transfer(String ifsc,float amount,int accountNumber)
	{
		System.out.println("parent class ifsc and method argumet method");
	}
	void transfer(long Phone)
	{
	System.out.println("parent class transfer");
	}
	public void transfer(long IMEI,long phoneNumber)
	{
		
	}
}
class OnlineBank extends Bank
{
	public void transfer(String imps_num) // overloaded
	{
		System.out.println("overloading in chaild class");
	}
	@Override
	void transfer(long Phone)  // overriding
	{
		System.out.println("chaild class transfer");	
	}
}
public class OverloaingPoly {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OnlineBank ob=new OnlineBank();
ob.transfer("ABC",2312.23f,231212);// compiler will bind that required method using parameters your passing

ob.transfer("SBIN000312"); // compile time poly

ob.transfer(9177000988l);// run time poly or JVM can find the required method based on object or run time poly or late binding

Bank b=new Bank("ICICI", 123, "corporate");
b.transfer(9704150345l);
//ob.tranfer("SBIN@12312", 12312312.33f);
	}
}
