package Day2.oop;
class BankCustomer
{
	// properties
	String name;
	long accountNumber;
	float balance;
	BankCustomer(String name,int accountNumber,float balance)
	{
		this.name = name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	// actions
	public void transfer(float amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("transfered");
		}
		else
		{
			System.out.println("no balance");
		}
		
	}
	public void getBalanceDetails()
	{
		System.out.println("the balance is "+balance);
	}
}
class BankStaffCustomer extends BankCustomer
{

	BankStaffCustomer(String name, int accountNumber, float balance) {
		super(name, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}
	
// add more 	
}
class MobileBanking
{
	
}
class Bank
{
	String name;
	int zipcode;
	public void getBankPolicies()
	{
		
	}
}

class OopExampleTest {

	public static void main(String[] args) { // how to test objects with out main? unit testing or mockito testing?
		// TODO Auto-generated method stub
		BankCustomer cust1 = new BankCustomer("BACD",1234,10000.23f);
		cust1.getBalanceDetails();
		cust1.transfer(12000);
		cust1.getBalanceDetails();
		
		
		BankCustomer cust2 = new BankCustomer("XYZ",6555,100000.23f);
		cust2.getBalanceDetails();
		cust2.transfer(10000);
		cust2.getBalanceDetails();
		
		
		
		
		Bank b = new Bank();
		b.getBankPolicies();
	}

}
