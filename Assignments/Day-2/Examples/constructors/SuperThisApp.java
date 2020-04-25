package Day2.constructors;
 class Cust_Bank
{
	int account_no;
	String name;
	int phono;
	String address;
	final int c=234;
	public Cust_Bank() {
		// TODO Auto-generated constructor stub
		System.out.println("parent clss defualt constructor");
		account_no=100;
	}
	public Cust_Bank(int account_no,String name,int phono,String address) 
	{
this.account_no=account_no;
this.name=name;
this.phono=phono;
this.address=address;
	}
	public void print()
	{
		System.out.println(account_no+":"+name+":"+phono+":"+address);
	}
	@Override
	public String toString() 
	{
		return "Account Holder name: "+account_no+"\nAccount Name : "+name+"\n Cellno :"+phono+"\n Address:"+address;
	}
	@Override
	public int hashCode() {
		return account_no;
	}
}
class OnlineBank extends Cust_Bank
{
	
	String uname,pass;
	public OnlineBank(String uname,String pass,int account_no,String name,int phono,String address)
	{
super(account_no,name,phono,address);
this.uname=uname;
this.pass=pass;
System.out.println("chaid class parameterized constructor");
	}
	public OnlineBank() {
		this("uname","pass",123,"mar",9988,"addr");
		// super(); // invoke super class decfault constructors by JVM
System.out.println("chaild class default constructor");
}
	public void print()
	{
		System.out.println(account_no+":"+name+":"+phono+":"+address);
		System.out.println(uname+":"+pass);
	//	System.out.println(c);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+": user name : "+uname+"\n: password is: "+pass;
	}
}
public class SuperThisApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OnlineBank ob1=new OnlineBank();

		/*Cust_Bank cb=new Cust_Bank(5874, "Mar", 12345, "Hyd");
		OnlineBank ob=new OnlineBank(5874, "Mar", 12345, "Hyd","marHyd","india");
		cb.print();
		ob.print();
		
		
		System.out.println(cb);
		System.out.println("online bank account detials");
		System.out.println(ob);

		System.out.println(cb.hashCode());
		System.out.println(ob.hashCode());
*/	}

}
