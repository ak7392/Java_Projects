package CollectionFrameworkDemo;
import java.util.*;
public class NavigavableSetApp {

	public static void main(String[] args) {
NavigableSet ts=new TreeSet();
ts.add(87);
ts.add(874);
ts.add(963);
ts.add(3);
System.out.println(ts);
Iterator i1=ts.descendingIterator();
while(i1.hasNext())
System.out.println(i1.next());

System.out.println(ts.floor(87));
System.out.println(ts.ceiling(87));
System.out.println(ts.higher(87));
	}

}
