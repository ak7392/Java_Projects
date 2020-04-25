package oopPrac;
import java.util.Scanner;
public class oopsPrg {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an Interger: ");
		int k = 1;
		int row = obj.nextInt();
		for(int i = 0 ; i <= row; i++) {
			for (int j = 0; j<= i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
