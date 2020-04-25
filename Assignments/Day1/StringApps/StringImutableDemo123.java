package StringApps;


public class StringImutableDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s="hello ";
s.concat("hai");
s.replace('h', 'y');
System.out.println(s); // strings are immutable 
StringBuffer sb=new StringBuffer("hello ");
sb.append("hai");
System.out.println(sb); // string are mutable

String s1="helo hei hai hello how are you";
String a[]=s1.split(" ");

for(String a1:a)
	System.out.println(a1);*/
		StringBuffer sb=new StringBuffer("madam123");
		String s=new String(sb);
		//StringBuffer sb1=sb;
		//System.out.println(sb1);
		sb.reverse();
		//System.out.println(s);
	//	System.out.println(sb1);
		System.out.println(s);
		System.out.println(sb);
		//String s=new String(sb);
		//System.out.println(s.equals(sb));
		System.out.println(s.equals(new String(sb)));
	//	System.out.println(sb2);
//		System.err.println(sb);
		
		//boolean b=s.equals(sb2);
	//	System.out.println(b);*/
		/*System.out.println(sb2);
	String s=new String(sb2);*/
	//System.out.println(s.equals(sb));
	//System.out.println(s.equals(new String(sb)));
		//System.out.println(sb2.equals(sb));
		//System.out.println(sb.equals(sb2));
	}
}
