package Day4.collectionframework1;
import java.util.*;
class Employee1
{
	int eid;
	String ename;
	float esal;
	Date edoj;
	// methods
}
class MyGen<T>
{
	
	T obj;
void add(T obj){this.obj=obj;}
T get(){return obj;
}
}
class TestGenerics3
{
public static void main(String args[])
{
MyGen<Integer> m=new MyGen<Integer>();
m.add(2);
//m.add("vivek");//Compile time error  
System.out.println(m.get());
System.out.println(m);

MyGen<String> m1=new MyGen<String>();
m1.add("Maruthi");
m1.add("Kusuma");
//m1.add(234);

System.out.println(m1.get());

MyGen<Integer> mi=new MyGen<Integer>();
mi.add(234);

System.out.println(mi.get());

MyGen<Employee1> m5=new MyGen<Employee1>();
m5.add(new Employee1());
//m5.add("hello");
MyGen m45=new MyGen();
m45.add(589);

}
}