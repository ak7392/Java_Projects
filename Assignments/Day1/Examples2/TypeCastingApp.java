public class TypeCastingApp {

	public static void main(String[] helloo) {
		
		int $_hello123_$=234;
	
		int i='z'; // widening, it hapens automatically at compile time only
		// i value from 0 to 65535
		System.out.println(i);  // UNI/ASCI codes values
		float f1=15000; // widening
		System.out.println(f1);
		

		short s=  (short) 32773; // narrowing
		System.out.println(s);
		
		
		float f=123;
		System.out.println(f);
		
		
		
		int a=    (int) 35.99f; // narrowing
		System.out.println(a);
		
		
	//		System.out.println(Math.round(35.99f));
		
		System.out.println((char)121);
		
		
		System.out.println((char)120); // narrowing
		// TODO Auto-generated method stub
	
		
		int i1=(int)(8.0/3.0);
		int j=(int) 2147483648.0f;
		System.out.println("i = "+i1+" j= "+j);
		byte b= 25;
		short s1= (short) 65531;
		System.out.println("b= "+b+" s= "+s1);
		System.out.println("Converting int to char " +(char)75);
		//double d = i1 * b * s1 * 2.0;
		//System.out.println("Conversion to double result is : 		"+d);
		int b1=25;
		int i2=(b1)<<1;
		System.out.println("i2 = "+i2);
		/*byte b1=(12+6);
		System.out.println(b1);
		*/
		byte b2=10;
		byte a2=20;
		byte c2= (byte) (b2+a2); 
		
		short s3=123;
		short s2=321;
		short s4= (short) (s2+s3);
		
		int i5=23;
		int i6=67;
		int i7=i5+i6;
		
System.out.println(c2);

System.out.println((float)13/2);

System.out.println(helloo.length);

Float f9=new Float(90.768f);
Integer i9=new Integer(28);
int x=i9/2;
System.out.println(x);
int v=i9+3;
System.out.println(v);
	}

}
