package CollectionFrameworkDemo;
import java.util.*;
public class ItetarorDemo123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al =new ArrayList<Integer>();
for(int i=1;i<=10;i++)
al.add(i);
/*al.add("hai");
al.add("hello");*/
System.out.println(al);
Iterator<Integer> i1=al.iterator();
while(i1.hasNext())
{
	int i= i1.next();
	if(i%2==0)
	System.out.println(i);
	else
	i1.remove();
	//System.out.println("hello");
}
System.out.println(al);

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
