package Bank_Application;

public class CurrentAccount extends Account{
	private double overdraft_limit;
	
	Account ac = new Account();
	private double balance = ac.getBalance();
	private double custName;
	
	
	
	public CurrentAccount(int id, double balance, double annualInterestRate, double overdraft_limit) {
		super(id, balance, annualInterestRate);
		this.overdraft_limit = overdraft_limit;
			
	}
	
	public double addOverdraftlimit(double amount) {
		overdraft_limit = balance + amount; 
		return overdraft_limit;
	}
	
	public double withdraw(double amount) {
		if (amount > overdraft_limit) {
			System.out.println("No Funds");
			System.out.println("Send a Letter to a Customer");
		}
		else {
		balance = balance - amount;
		}
		return amount;
	}
	
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

}
