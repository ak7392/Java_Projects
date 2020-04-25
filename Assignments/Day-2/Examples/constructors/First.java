package Day2.constructors;
class Product
{
	int pid;
	String name;	
	public Product(int i, String string) {
		this.pid = i;
		this.name = string;
	}
	public void getProductDetails() {
		System.out.println(this.pid);
		System.out.println(this.name);
	}
}
class Child123 extends Product
{
	public Child123(int i, String string) {
		super(i, string);
		// TODO Auto-generated constructor stub
	}
}
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(12,"Phone");
		Child123 c= new Child123(55,"R");
		c.getProductDetails();
	}

}
