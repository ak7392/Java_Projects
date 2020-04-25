package InheritanceApps;
class Bank
{
final int workingHours=20;
private String name;

public Bank() {
	// TODO Auto-generated constructor stub
}
public int getWorkingHours() {
	return workingHours;
}
public String getName() {
	return name;
}
public void trasnscations()
{
	System.out.println("withdraw money");
}
void loanProcess()
{
	System.out.println("deposit");
}
public void transfer()
{
	System.out.println("tranfer");
}
public static void test123(int x)
{
	System.out.println("static methods");
}
}
class OnlineBank  extends Bank
{
	private String username,password;
	public void transferOnline()
	{
		//workingHours++;
	System.out.println("transfer through online"+getWorkingHours());	
	}
}
class MobileBanking extends OnlineBank // extends Bank
{
	
}
public class TestInheritanceApp {

	public static void main(String[] xxxxxx) {
		// TODO Auto-generated method stub
		OnlineBank o=new OnlineBank();
		o.trasnscations();
		o.transfer();
		o.transferOnline();
		o.loanProcess();
		Bank.test123(234);
		
		Bank b=new Bank();
		//System.out.println(b.workingHours);
	}

}
