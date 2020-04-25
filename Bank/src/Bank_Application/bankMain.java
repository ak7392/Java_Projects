package Bank_Application;

public class bankMain{
	
	public static void main(String args[]) {
		Account ac = new Account();
		CurrentAccount ca = new CurrentAccount(2,23, 2.3, 23);
		
		Bank b = new Bank();
		b.addCustomer(1,23, 4.5);
		Bank c = new Bank();
		
		c.addCustomer(2,24, 4.9);
		c.displayAccountList(2);
		c.addSavingsAccount(2, 24, 4.6);
		ca.withdraw(1200);
		c.updateCurrentCustomer(2, 2000);
	}

}
