package Exception_Programs;
import java.lang.String;

class exceptionClass extends NumberFormatException {
	exceptionClass(String s){
		super(s);
}
}

public class BinaryToDecimal {
	
	
	
	public static double BinaryDec(String binary) throws exceptionClass {
		if (!isboolean(binary)) {
			throw new exceptionClass("This is not a valid Binary Input");
		}
		
		double j = 0;

		
		for (int i =0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				j = j+ Math.pow(2, binary.length()-1-i);		
			}	
		}
		return j;
		
		}
	
	public static boolean isboolean(String s) {
		for(char ch: s.toCharArray()) {
			if (ch != '0' && ch != '1') 
				return false;	  
		}
		return true;
	}
		
	
	
	public static void main(String args[]) {
		
//		BinaryToDecimal btd = new BinaryToDecimal();
//		System.out.println(btd.BinaryDec("1101011"));
		System.out.println(BinaryDec("1011"));
		System.out.println(BinaryDec("aksdaskd"));
		
		
	}

}
