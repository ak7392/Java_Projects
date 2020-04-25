package StringApps;
public class StringMEthods 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello friends";
		String s2="Hello";
		System.out.println(s1.length());
				System.out.println(s1.charAt(4)+"\n");
				System.out.println(s1.equals(s2));
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s1.length());
				char c='G';
				System.out.println(s1.replace('l','a'));
				System.out.println(s1.substring(2,8));
				System.out.println(s1.toUpperCase());
				String email="Maru.";
				String email1="maruthi@gmail.com";
				// marthi@hyd.com
				//maruthi@guntur.com
				System.out.println(email.indexOf('@'));
				System.out.println(email.indexOf('.'));
				System.out.println(email1.indexOf('@'));
				System.out.println(email1.indexOf('.'));
				// . 12 is the index
				// i1 index of @=7
				// i2 index of .=13
				// string s1=substring(i1,i2)
				// string s1=s1.substring(12,15)
				// if(s1.equals("gmail") || (s1.equals("yahoo") || ....
				String s4="China";
				String s3="Hyder";
				int i3=s4.compareTo(s3);
				System.out.println("the compare to method value "+i3);
				if(i3<0)
				System.out.println(s3+" s3 is bigger one");
				else
				System.out.println(s4+" s4 is bigger one");
				String s5="hello";
				String s6=" Hyderabad123";
				System.out.println(s5.concat(s6));
				System.out.println(s5+s6);
				String s8=s5+s6;
				System.out.println(s8);
				String s7="        hello hyd     ";
				System.out.println(s7);
				System.out.println(s7.trim());
				String mail_id="@marumail.com";
				int i=mail_id.indexOf('@');
				if(i<0)
				System.out.println("invalid email id");
				else
				System.out.println("valid email ");
				String phone_number="9177000988";
				
				if(phone_number.length()!=10)
				System.out.println("invalid mobile numer");
				else
				System.out.println("valid number");
				String s="30000";
			//	System.out.println(s++);
				int i1=Integer.parseInt(s);
				System.out.println(++i);
				
				String s0="9177000988";
				for(int k=0;k<s0.length();k++)
				{
					if(s0.charAt(k)>=48 && s0.charAt(k)<=57)
					continue;
					else
					{
						System.out.println("invalid phone number");
						break;
					}
					
				}
				
	}
}
