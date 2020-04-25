package StringApps;

public class InternStringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
boolean b=s.equals(s.intern());
System.out.println(b);
	}

}
