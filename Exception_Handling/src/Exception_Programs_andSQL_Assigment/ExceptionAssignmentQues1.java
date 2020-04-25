package Exception_Programs;
import java.util.Scanner;

class nonintresultexception  extends Exception{ // Since this is Superclass for 
	public nonintresultexception(String i) {
		super(i);
	}
	
}

public class ExceptionAssignmentQues1 {
	
	
	public static void main(String args[]) throws nonintresultexception {
			
		try
		{
			// declare and initialize here.
			int a,b,c, d = 0;
			Scanner KB=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=KB.nextInt();
       
			System.out.print("Enter second number : ");
			b=KB.nextInt();
       
			//throw to catch
			c=a/b;
//			System.out.println(d == (c%2));
			int rem = a % b;
			if (rem != 0) {
				String str;
				str = String.format("Integer %2d divided by %2d does not give an integer", a, b);
				throw new nonintresultexception(str);
			}
			else {
				System.out.println(c);
			}
			
		}

		finally {
		System.out.println("End of Program...");}
	}

			
			
}
	
	

