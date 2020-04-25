  
import java.util.Scanner;
class Test
{
	int x;
	 int revIt(int n)
	{
		int n1,r=0;
		while(n!=0)
		{
			n1=n%10;
			r=(r*10)+n1;
			n=n/10;
		}
		return r;
	}
	 
	 void print()
	{
		int j=1;
		while(j<=10)
		{
			System.out.println(j);
			j++;
		}
		//System.out.println(r);
	}
	public void printFor()
	{
		int i=1;
		for(;;)
		System.out.println(i);
	}
	boolean verifyMobileNumberCustomer(long mobilenumber)
	{
		// adding some java statements
		return true;
	}
}
public class WhileDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		System.out.println("Please enter any integer value");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x=t.revIt(n);
		//Test.revIt();
		System.out.println("The Reverse of " +n+" is " +x);
		// palindrome
		if(n==x)
		System.out.println(" the given number is palindrome");
		else
			System.out.println("given number is not palindrome");		
	//	Test.printFor();
	//	t.print();
	//	t.printFor();
		//	System.out.println(n1);
}
}