package CollectionFrameworkApps;

import java.util.ArrayList;
import java.util.Random;

public class RamdomListElements {
static void f(String S[])
{
	ArrayList<String> L=new ArrayList<String>();
	int n=S.length;
	Random gen=new Random();
	for(String s:S)
	L.add(s);
	for(int i=0;i<n;i++)
	{
		int j=gen.nextInt(n-i);
		String s=L.get(j);
		System.out.println(s);
		S[i]=s;
		L.remove(s);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] names ={"Abc","efg","hhi","yui","poi"};
f(names);
for(String name:names)
System.out.println(name);
	}

}
