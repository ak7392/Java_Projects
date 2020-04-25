package Collections1;

import java.util.Hashtable;
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;		
	}
	@Override
	public String toString()
	{
		return i+"";
	}
	@Override
public int hashCode()
	{ 
		// by default its 11, you can change is 9
	return (i%9);// hash function key%table size, divison hash function
	//return i;
	} }
public class HashTableDemo123 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Temp,String> ht=new Hashtable<Temp,String>();
ht.put(new Temp(5), "A");
ht.put(new Temp(2), "B");
ht.put(new Temp(6), "C");
ht.put(new Temp(15), "D");
ht.put(new Temp(23), "E");
ht.put(new Temp(16), "F");
ht.put(new Temp(33), "z");
System.out.println(ht.size());

System.out.println();
System.out.println(ht);
	}
}
