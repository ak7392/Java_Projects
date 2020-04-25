package Day4.collectionframework2;

import java.util.TreeSet;

public class TreeSetDemo123  {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<String>();/*new CustomizeSortingOrder());*/
ts.add("Hello"); 
ts.add("Hellz");// its calling equals() methods to identify duplicate objects
ts.add("Zoo"); 
ts.add("Zoo"); // treeset is calling a method of the string class, compareTo() method.
ts.add("Apple");
ts.add("Little");
ts.add("Tiger");
ts.add("Hello");
//ts.add(7089);
//ts.add(null);
System.out.println(ts);


System.out.println(ts.descendingSet());
System.out.println(ts);

/*Collections.sort(), this is for increasing order/ decreasing order
 * 
 * TreeSet ts1=new TreeSet();
ts1.add(90);
ts1.add(9);
ts1.add(790);
ts1.add(190);
System.out.println(ts1);*/
	}



}
