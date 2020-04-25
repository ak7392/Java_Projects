import java.util.Scanner;
public class MatrixApp {

	public static void main(String[] ooo) {
		// TODO Auto-generated method stub
int a[][],b[][],c[][];
a=new int[3][3];
b=new int[3][3];
c=new int[3][3];


System.out.println("enter elements for the matrix A");
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
System.out.print("Please Enter Element for ["+i+"]["+j+"]: ");
		a[i][j]=sc.nextInt();

	}
}
System.out.println("The Matrix A you entered is :\n");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(a[i][j]+"\t");

	}
	System.out.println();
}

System.out.println("enter elements for the matrix B");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
System.out.print("Please Enter Element for ["+i+"]["+j+"]: ");
		b[i][j]=sc.nextInt();

	}
}
System.out.println("The Matrix B you entered is :\n");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(b[i][j]+"\t");

	}
	System.out.println();
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		c[i][j]=a[i][j]+b[i][j];
	}
}

System.out.println("The Matrix C after addition :\n");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(c[i][j]+"\t");

	}
	System.out.println();
}

}
}