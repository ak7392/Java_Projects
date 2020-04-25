package PatternUsingForLoops;

public class DiamondNumericPattern {
	public static void main(String args[]) {
		int n =5; 
		
		for (int i=1; i <= 5; i++) {
			for(int j =0; j<= i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k <= 5; k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		for (int i=5; i >= 1; i--) {
			for(int j =0; j<= i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k <= 5; k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}

}
