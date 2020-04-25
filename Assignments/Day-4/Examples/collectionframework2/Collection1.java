package Day4.collectionframework2;
import java.util.ArrayList;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(12);// it will convert as a objecct, Integer object.
		al.add(new Integer(23));
		
		System.out.println(al);
		int i = (Integer)al.get(1); // it return Object
		System.out.println(i);
	}

}
