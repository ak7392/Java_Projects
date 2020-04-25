package StringApps;

public class StringSCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="banglr";
String s2=new String("banglr");
String s3="banglr";
String s4=new String("banglr");
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s2==s4);
System.out.println(s2.equals(s4));
	}
}
