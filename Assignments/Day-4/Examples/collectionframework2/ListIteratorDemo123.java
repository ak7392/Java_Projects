package Day4.collectionframework2;

import java.util.*;

public class ListIteratorDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.add("abc");
ll.add("oop");
ll.add("hyd");
ll.add("acd");
ll.add("uii");
//ll.add(90);
System.out.println(ll);
	
ListIterator li=ll.listIterator(5);
//ListIterator li=ll.listIterator();
/*while(li.hasNext())
	{
		String s=(String) li.next();
		System.out.println(s);
		if(s.equals("hyd"))
			li.add("Vja");

		//li.remove();
	//li.set("Vij");
		}*/

while(li.hasPrevious())
	{
		System.out.println(li.previous());
	//	li.set("helllo");
	}

System.out.println(ll);

List l9=new LinkedList();
//l9.addFirst(89);


	}
	

}
