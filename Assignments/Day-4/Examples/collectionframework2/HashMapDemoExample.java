package Day4.collectionframework2;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemoExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
//LinkedHashMap hm=new LinkedHashMap();
System.out.println(hm.put(124, "ram"));
System.out.println(hm.put(87,"China"));
//hm.put("hello", 3324);
System.out.println(hm.put(898,"ma"));
hm.put(87999,"565");
hm.put(342,"ram");
/*hm.put("hai","hello");*/
System.out.println(hm);

System.out.println("duplicate values");
System.out.println(hm.put(898,"kusu"));
System.out.println(hm);

System.out.println(hm.remove(87));
System.out.println(hm);
System.out.println(hm.get(342));

Set s1=hm.keySet();// you can apply iterator on this set
System.out.println(s1);

Collection c1=hm.values(); // you can also apply iterator on the values
System.out.println(c1);

// iteration
Set s2=hm.entrySet();  // Entry objects
System.out.println(s2);

Iterator i1=s2.iterator();
while(i1.hasNext())
{
	Entry m1=(Entry) i1.next();
	System.out.println(m1.getKey()+"----"+m1.getValue());
	int i2=(Integer) m1.getKey();
	if(i2==898)
	m1.setValue("Maruthi");
}
System.out.println(s2);
System.out.println(hm);



HashMap hm1=new HashMap();
hm1.put(56, 98);
hm1.put(34, 2555);
hm1.putAll(hm);
System.out.println(hm1);

	}

}
