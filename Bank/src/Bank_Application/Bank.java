package Bank_Application;
import java.util.*;
import java.util.*;

public class Bank {
	Scanner sc = new Scanner(System.in);
	
    private   String dateCreated;
//	public Bank(int id, double balance, double annualInterestRate, double overdraft_limit) {
//		super(id, balance, annualInterestRate, overdraft_limit);
//	}
	public Bank() {
		try{
			System.out.println("Please enter Date of Account creation under double Quotes : ");
			this.dateCreated = sc.nextLine();
		}
		catch(Exception e) {
			System.out.println("Please enter valid Date Format");
		}
	}


	ArrayList<Account> ListNew =new ArrayList<>();
	ArrayList<SavingsAccount> ListSaving =new ArrayList<>();
	ArrayList<CurrentAccount> ListCurrent =new ArrayList<>();
	
	Account ac = new Account();
	
	
	
	public void addCustomer(int id, double balance,double annualInterestRate) {	
		ListNew.add(new Account(id, balance, annualInterestRate));	
	}
	
	
	public void addSavingsAccount(int id, double balance, double annualInterestRate) {
		ListSaving.add(new SavingsAccount(id, balance, annualInterestRate));
	
	}
	
	public void addCurrentAccount(int id, double balance, double annualInterestRate, double overdraft_limit) {
		ListCurrent.add(new CurrentAccount(id, balance, annualInterestRate, overdraft_limit));

}
	
	
	public void deleteCustomer(int id) {
		for(int i=0; i <= ListNew.size()-1; i++){
	        Account ac = ListNew.get(i);
	        if(ac.getId() == id) {
	        	ListNew.remove(ListNew.get(i));
	        }
		}
	}
	
	public void updateSavingCustomer(int id) {
		for(int i=0; i <= ListSaving.size()-1; i++){
			SavingsAccount sa = ListSaving.get(i);
	        if(sa.getId() == id) {
	          ListSaving.get(i).addInterest();
	        }
	        }
	}
	
	public void updateCurrentCustomer(int id, double amount) {
		for(int i=0; i <= ListCurrent.size()-1; i++){
			CurrentAccount ca = ListCurrent.get(i);
	        if(ca.getId() == id) {
	        	ListCurrent.get(i).withdraw(amount);  // This withdraw method will inform banker 
	        	// to send an overdraft Letter 
	        }
		}
	}
	
	
	
//	public String toString(int id){
//		
//		for(int i=0; i <= ListNew.size(); i++){
//			Account aa = ListNew.get(i);
//	        if(aa.getId() == id) {
//	        	var str1 = Integer.toString(ListNew.get(i).getId());	
//	        }
//	        
//		}
//		return "Customer ID: " + str1;
//	}
	
	public void displayAccountList(int id){
	    for(int i= 0; i<= ListNew.size()-1; i++){
	    	Account ac = ListNew.get(i);
	         System.out.println(ac.getId());
	         System.out.println(ac.getBalance());
	         System.out.println(ac.getAnnualInterestRate());
	         System.out.println(dateCreated);
	         System.out.println(ac.getMonthlyInterest(ac.getAnnualInterestRate()));
	    }
	}
}
		
	
		
	


