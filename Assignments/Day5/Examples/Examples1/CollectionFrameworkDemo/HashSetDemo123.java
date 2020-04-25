package CollectionFrameworkDemo;

import java.util.*;

public class HashSetDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet hs=new HashSet();
LinkedHashSet hs=new LinkedHashSet();
hs.add("B");
Integer i1=new Integer(90);
hs.add(i1);
System.out.println(hs.add(90.00));
String s1=new String("Hai");
hs.add(s1);
String s2="Hai";
System.out.println("the value is"+hs.add(s2));


System.out.println(hs.add("C")); // its calling hashcode() of String class, calling equals() of String class to get duplicat
// string objects
System.out.println(hs.add("D"));
hs.add("Z");
hs.add(null);
hs.add(new Integer(109));
System.out.println(hs.add("C"));
hs.add(234234);
System.out.println(hs.add("D"));
hs.add(null);

System.out.println(hs);

int l=hs.size();
System.out.println(l);

System.out.println();

	}

}
