package Exception_Programs;


class ZeroDivision  extends ArithmeticException{ 
	
//	private static final long serialVersionUID = 1L;

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Since this is Superclass for 
	public ZeroDivision(String i) {
		super(i);
	}	
}


class nonintresultexception  extends ArithmeticException{ /**
	 * 
	 */
	private static final long serialVersionUID = -8179640260305804888L;

/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

 //Since this is Superclass for 
	public nonintresultexception(String i) {
		super(i);
	}	
}


public class ExceptionAssignmentQues2_1 {
	



	public static float[] integerarraymath(int[] numArray, int num) throws nonintresultexception  {
		float[] result = new float[numArray.length];
			 
		for (int i=0; i <= numArray.length-1;i++) {
			
			try {
			
				int rem = numArray[i] % num;
				result[i] = numArray[i] / num;
				if (num == 0) throw new ZeroDivision("New");
				else if (rem != 0) throw new nonintresultexception("New");
			
			}
			catch(ZeroDivision ae){
			

				System.out.println("Zero division Error");
			}
			
		}		
			
		return result;
				
}
		
	
	public static void main(String args[]){
		int[] numArray = {2,6,4,6};
		
		float[] result = integerarraymath(numArray, 3);
		float[] result2 = integerarraymath(numArray, 0);
		for (int i=0; i <= result.length-1;i++)
			System.out.println(result[i]);
		for (int i=0; i <= result2.length-1;i++)
			System.out.println(result[i]);
		
	}

}

