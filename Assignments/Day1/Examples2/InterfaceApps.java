interface DataBaseConnection
{
	int i=52; // public static final
	void connection(); // public abstract
}
class Oracle implements DataBaseConnection
{
	
@Override
	public void connection() {
		// TODO Auto-generated method stub
//	i++;
		System.out.println("connetcing using oracle driver");	

	}
	/*@Override
	public void connection() {
		// TODO Auto-generated method stub
	System.out.println("connetcing using oracle driver");	
	}*/
}
class Mysql implements DataBaseConnection
{

	@Override
	public void connection() {
		
		System.out.println(" connecting using mysql driver");
	}
}
public class InterfaceApps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Oracle o1=new Oracle();
o1.connection();
Mysql m=new Mysql();
m.connection();

DataBaseConnection d1=new Oracle();

d1.connection();
DataBaseConnection d2=new Mysql();
d2.connection();

	}

}
