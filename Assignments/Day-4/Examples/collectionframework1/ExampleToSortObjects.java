package Day4.collectionframework1;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class ExampleToSortObjects {
	public static void main(String[] args) {
		Employee e1 = new Employee("sachin",231);
		Employee e2 = new Employee("ganesh",56);
		Employee e3 = new Employee("kusuma",78);
		Employee e4 = new Employee("anil",56);
		TreeMap<Employee, Float> tm=new TreeMap<Employee,Float>();
		tm.put(e1, 2334.4f);
		tm.put(e2, 34534.5f);
		tm.put(e3,123.43f);
		tm.put(e4, 3434.4f);
		System.out.println(tm);
		System.out.println("----------------Comparable Sort----------------");
		Set<Entry<Employee, Float>> s=tm.entrySet();
		Iterator<Entry<Employee, Float>> iterator = s.iterator();
		while (iterator.hasNext()) {
			Entry<Employee, Float> e= iterator.next();
			System.out.println(e.getKey()+"  ---   "+e.getValue());
		}
	}
}