package CollectionFrameworkDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
al.add("Z");
al.add("X");
al.add("A");
al.add("W");
al.add("Y");
//al.add(900);
System.out.println(al);
Collections.sort(al,new CustomizeSortingOrder()); // only homogeous elements to sort the dat
System.out.println(al);	
	}

}
