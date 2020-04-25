package CollectionFrameworkApps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq= new PriorityQueue(15);//,new MyComparator123());
System.out.println(pq.peek());
//System.out.println(pq.element());
/*for(int i=1;i<=10;i++)
pq.offer(i);
System.out.println(pq);
System.out.println(pq.poll());

System.out.println(pq);*/
pq.offer("A");
pq.offer("C");
pq.offer("B");
pq.offer("Z");
for(int i=0;i<pq.size();i++)
System.out.println(pq.peek());
	}

}
class MyComparator123 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=(String)o2;
		return -s2.compareTo(s2);
	}
}
