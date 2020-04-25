package Collections1;

import java.util.ArrayList;
import java.util.Collections;
public class ArraySearchMethods {
	public static void main(String[] args) {
	ArrayList al1=new  ArrayList();
	al1.add("yes");
	al1.add("tr");
	al1.add("ap");
	al1.add("gt");
	al1.add("mum");
	System.out.println(al1);
	//Collections.reverse(al1);
/*	System.out.println(al1);
	System.out.println(Collections.max(al1));
	System.out.println(Collections.min(al1));*/
	
	CustomizeSortingOrder t=new CustomizeSortingOrder();
	Collections.sort(al1,t); // decreasing order
	System.out.println(al1);
	//System.out.println(Collections.binarySearch(al1,"pl",t));
	int x=Collections.binarySearch(al1,"tr",t);
	System.out.println(x);
	if(x<0)
	System.out.println("element is not found");
	else
		System.out.println("element is found");
	
	// CompareTo method in java
	// returns -ve integer String on left side of comapreto method i smaller
	System.out.println("A".compareTo("Z"));
	// 0 when strigns are equal 
	System.out.println("Z".compareTo("Z"));
	// positive when the string on left side of compareto method is greater in ASCII value of string on 
	//right side of compareTo String
	System.out.println("Z".compareTo("A"));
	
	
	}
}
