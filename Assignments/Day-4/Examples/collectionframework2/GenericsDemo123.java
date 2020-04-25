package Day4.collectionframework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsDemo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList all=new ArrayList();
		all.add("A");
		all.add("B");
		all.add("T");
		all.add(new Integer(90));*/
		//String s=(String) all.get(1);
		ArrayList<String> all=new ArrayList<String>();
		all.add("B");
		all.add("T");
		all.add("A");
		//System.out.println(all.indexOf("T"));
		//all.add(new Integer(90));
		//all.addAll((Collection<? extends String>) new ArrayListExample());
		String s= all.get(1);
		System.out.println(s);
		
		
		System.out.println(all);
		Collections.sort(all);
		System.out.println(all);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(213);
		
	}

}
