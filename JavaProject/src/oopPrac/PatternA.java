package oopPrac;
import java.util.Scanner;
import java.util.Calendar;
public class PatternA {	
		public static void main(String args[]) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter an Interger: ");
			
			Calendar rightnow = Calendar.getInstance();
			rightnow.day
				
			
			int row = obj.nextInt();
			for(int i = 0 ; i <= row-1; i++) {
				for (int j = 0; j<= i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k <= row-1-i; k++) {
					System.out.print("*" + " ");
				}
				System.out.println();
			}
		}
	}



