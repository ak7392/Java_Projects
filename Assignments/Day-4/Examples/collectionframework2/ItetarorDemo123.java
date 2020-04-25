package Day4.collectionframework2;
import java.util.*;
public class ItetarorDemo123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al =new ArrayList<Integer>();
al.add(23);
al.add(9);
al.add(90);
al.add(19);
al.add(59);
al.add(925);
al.add(2);
al.add(69);
System.out.println();
/*al.add("hai");
al.add("hello");*/
System.out.println(al);
Collections.sort(al);
System.out.println(al);


Iterator<Integer> i1=al.iterator();
while(i1.hasNext())
{
	int i=  i1.next();
	if(i%2==0)
	System.out.println(i);
	else
	i1.remove();
	//System.out.println("hello");
}
System.out.println(al);

Collections.sort(al);

//System.out.println(al);

/*for(Object o:al)
{
	int i=(int)o;
	count++;
	if(i%2==0)
	System.out.println(i);
}

System.out.println("the number of objects"+count);

System.out.println(al);*/
	}
	

	
}
