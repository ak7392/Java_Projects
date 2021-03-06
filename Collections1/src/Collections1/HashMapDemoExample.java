package Collections1;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemoExample {
	
	public static void main(String[] args) {
	
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
			
			Set s2=hm.entrySet();  // Entry objects
			System.out.println(s2);
			
			Iterator i1 = s2.iterator();
			
			while (i1.hasNext()) {
				
				Entry m1 = (Entry) i1.next();
				System.out.println(m1.getKey()+ "Key Value Pair" + m1.getValue());
				
				int i2 = (Integer) m1.getKey();
				if (i2 == 87999) {
					m1.setValue("Abhinav");
				}
			
			}
			
			System.out.println(hm);
}
}
