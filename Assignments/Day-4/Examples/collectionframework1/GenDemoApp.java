package Day4.collectionframework1;
class Gen<T>
{
T obj;
void show()
{
	System.out.println(" The int value of Obj is :"+obj);
//	System.out.println(obj.doubleValue());
}
void add(T obj)
{
	this.obj=obj;
}
T get()
{
	return obj;
}
}
public class GenDemoApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> g1=new Gen<Integer>();
		g1.add(23);
		g1.show();
		System.out.println(g1.get());
		//g1.add("hello");
		Gen<String> g2=new Gen<String>();
		g2.add("Hyderabad");
		g2.show();
		System.out.println(g2.get());
		Gen g4=new Gen();
		g4.add(new Integer(90));
		g4.add("hai");
		System.out.println(g4.get());		
	}
}
