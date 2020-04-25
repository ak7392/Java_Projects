package Day4.collectionframework2;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();// legacy class
		
		for(int i=1;i<=10;i++)
		v.add(i); // autoboxing
		
		System.out.println(v);
		
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			int i=(Integer) e.nextElement();
			if(i%2==0)
			System.out.println(i);
		}
		for(Object o:v)
		{
			int i=(Integer) o;
			if(i%2==0)
			System.out.println(i+" even number");
		}
	}

}
