package Day4.collectionframework2;
import java.util.*;
import java.util.Map.Entry;
public class PhoneKeyPad {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> hm=new HashMap<String,Integer>();
hm.put("ABC", 2);
hm.put("EDF", 3);
hm.put("GHI", 4);
hm.put("JKL", 5);
hm.put("MNO", 6);
hm.put("PQRS", 7);
hm.put("TUV ", 8);
hm.put("WXYZ", 9);
System.out.println(hm);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a character");
	String s1=sc.nextLine();
	char c=s1.charAt(0);
	Set s2=hm.entrySet();

	Iterator i1=s2.iterator();
	while(i1.hasNext())
	{
		Entry m1=(Entry) i1.next();
		//int i2=(Integer) m1.getKey();
		String s=(String)m1.getKey();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
			System.out.println(m1.getValue());
			break;
			}
		}
	}
	}

}
