package CollectionFrameworkDemo;
import java.util.Comparator;
public class CustomizeSortingOrder implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
	
		String s1=(String) o1;
		String s2=(String) o2;
		return -(s1.compareTo(s2));
/*		Integer s1=(Integer) o1;
		Integer s2=(Integer) o2;
		if(s1>s2)
		return -1;
		else
			return 1;
*/		//return 5667;
	//	return 1;
		//return 98;
	//return 9455888;
	}
	/*public boolean equals(Object o)
	{
		 if (o instanceof Integer) {
			 return this(Integer).intValue()== ((Integer)o).intValue();
	}*/
//	}
}
