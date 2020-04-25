package Day4.collectionframework1;
import java.util.*;
public class TestWildCartApp {
public static void show(ArrayList<? extends Object> l)
{
	l.add(null);
  System.out.println(l);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("A");
al.add("B");
al.add("C");
show(al);

ArrayList<Integer> al1=new ArrayList<Integer>();
al1.add(234);
show(al1);
	}

}
