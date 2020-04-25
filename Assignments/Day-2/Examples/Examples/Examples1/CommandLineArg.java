package controlstatements;

import java.util.Scanner;
// i want to add all integer values entered in command line arguments
public class CommandLineArg {

	public static void main(String[] abcd) {
		int sum=0;
	for(String s:abcd)
	{
		// we can convert sting to integer if string contains integer
		int i=Integer.parseInt(s);
		sum=sum+i;
	}	
	System.out.println(sum);

	}

}
