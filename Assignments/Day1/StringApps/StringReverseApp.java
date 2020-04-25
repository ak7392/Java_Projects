package StringApps;
public class StringReverseApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s="abccba12";//"abccba";
int flag=1;
for(int i=0,j=s.length()-1;i<=s.length()/2;i++,j--)
{
	if(s.charAt(i)!=s.charAt(j))
	{
	flag=0;
	break;
	}
}
if(flag==1)
System.out.println("its palindrom");
else
System.out.println("its not a palidrom");*/

char c[]={'a','b','c','c','b','a'};
int flag1=1;
for(int i=0,j=c.length-1;i<=c.length/2;i++,j--)
{
	if(c[i]!=c[j])
	{
	flag1=0;
	break;
	}
}
if(flag1==1)
System.out.println("its palindrom");
else
System.out.println("its not a palidrom");
/*StringBuilder sb1=new StringBuilder("madam1");
StringBuilder sb2=sb1.reverse();
System.out.println(sb2);
if(sb1.equals(sb2))
System.out.println(" its a palindrmoe");
else
System.out.println("its not a palindrom");
*/	}
}