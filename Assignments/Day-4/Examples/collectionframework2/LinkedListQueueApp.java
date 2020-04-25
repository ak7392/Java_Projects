package Day4.collectionframework2;

import java.util.*;

public class LinkedListQueueApp {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new  LinkedList();
//for(int i=1;i<=10;i++)
ll.offer(25);

System.out.println(ll);
System.out.println(ll.poll());

System.out.println(ll);
if(ll.poll()==null)
System.out.println("its empty");
	}

}
