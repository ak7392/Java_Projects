package CollectionFrameworkDemo;
import java.util.LinkedList;
class LinkedListDemoApplication {
	public static void main(String[] xyz) {
LinkedList ll=new LinkedList();
ll.add("hello");
ll.add(new Integer(10));
ll.add("hyd");
ll.add(1984);
System.out.println(ll);
System.out.println(ll.size());

ll.add(2,"Bangle");
System.out.println(ll);

System.out.println(ll.size());


ll.add(null);
ll.add("hai");
ll.set(0,"software");
System.out.println(ll);

ll.add(0,"venky");
System.out.println(ll);

ll.removeLast();
ll.addFirst("CCC");
//System.out.println(ll.get(90));
System.out.println(ll.indexOf("software123"));
System.out.println(ll);
//System.out.println(ll.get(90));
	}
}
