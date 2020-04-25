package Bank_Application;
import java.util.Date;

public class Account {
	
		private int id;
		private double balance;
		private double annualInterestRate;
		public Date dateCreated;
		
		public Account( ) {
			this.dateCreated = new Date();
		}
			
//		public Account(){
//			 Date dateCreated = new Date();	
//		}
		
		public Account(int id, double balance,double annualInterestRate) {
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		
		public Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(Date string) {
			this.dateCreated = string;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		
		public double getMonthlyInterest(double annualInterestRate) {
			double monthlyInterest = ((annualInterestRate * 0.01) / 12);
			return monthlyInterest;
		}
		
		
		public double withdraw(double amount) {
			if (amount > balance) {	
			System.out.println("No Funds");
		}
			else {
				balance = balance - amount;
			}
			return amount;
		}
		
		public double deposit(double amount) {
			balance = balance + amount;
			return amount;
		}
		
		public String toString() {
			return "\nCustomerID: "+ getId() ;
		}
		
		

	

}
