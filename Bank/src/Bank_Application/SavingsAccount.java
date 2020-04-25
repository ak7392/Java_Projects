package Bank_Application;

public class SavingsAccount extends Account{

	private double interest;
	Account ac = new Account();
	double balance = ac.getBalance();
	
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
		this.interest = ac.getMonthlyInterest(annualInterestRate);	
	}
	
	public double addInterest() {
		ac.getBalance();
		
		balance = balance + (interest * 0.01);
		return balance;
	}
	
	@Override
	public double withdraw(double amount) {
		if (amount > balance) {	
		System.out.println("No Funds");
	}
		else {
			balance = balance - amount;
		}
		return amount;
	}
	
	@Override
	public double deposit(double amount) {
		balance = balance + amount;
		return ac.deposit(amount);
	}
	
	
}


