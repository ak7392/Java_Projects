  
import java.util.Scanner;


public class AddingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Please enter a integer value...");
		// create object for the scanner class
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp,sum=0;
		while(x!=0)
		{
			temp=x%10;
			sum=sum+temp;
			x=x/10;
		}
		
		System.out.println("the sum of given number is"+sum);
	}

}
