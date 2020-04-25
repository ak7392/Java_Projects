package CollectionFrameworkDemo;
import java.util.ArrayList;
import java.util.*;
public class ArrayCollectionApps {
	public static void main(String[] args) {
int a[]={3, 4, 10, 1, 5,7,8,2,6,10};
List al=Arrays.asList("Hai","raj","po");
System.out.println(al);
List al1=Arrays.asList(3,5,6,7);
System.out.println(al1);
/*for(Object x: al)
{
	int x1=(Integer)x;
System.out.println(x1);*/
//}
/*int dup=0;
int flag=0;
for(int i=0;i<10;i++)
{
	for(int j=i+1;j<10;j++)
	{
	if(a[i]==a[j])
	{
		dup=a[j];
		flag=1;
	}
}
}
int position=1;
Arrays.sort(a);
for(int i=0;i<10;i++)
{
	if(a[i]!=position)
	{
	System.out.println(" missed number is"+position);	
	}
	position++;
}
	if(flag==1)
	System.out.println("duplicate values is"+dup);
	else
		System.out.println("no duplicates");*/
	}
}
