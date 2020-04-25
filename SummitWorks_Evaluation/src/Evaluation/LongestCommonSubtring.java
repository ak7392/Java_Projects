package Evaluation;
import java.util.*;

public class LongestCommonSubtring {
	private static String res;

	public static String comparison(String[] s) {
		String res  = "";
		
		for(int i =0; i <= s.length-1; i++) {
		String comparison_String = s[0];
		String new_String = s[i];
		for (int j=0; j< Math.min(comparison_String.length(), new_String.length()); j++) {
			if (comparison_String.charAt(i) != new_String.charAt(j)) {
				break;
			}
			
			res = comparison_String.substring(0,j);
		}
		
		}
		return res;
	}
	
	public static void main(String args[]) {
			String result;
			String[] s3 = {"apple", "ape", "april"};
			
			StringBuilder s = new StringBuilder();
			
			
			result = LongestCommonSubtring.comparison(s3);
			System.out.println(result);		
		
			
			
	}
}
