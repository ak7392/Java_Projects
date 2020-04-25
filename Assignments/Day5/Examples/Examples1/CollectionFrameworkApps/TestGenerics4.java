package CollectionFrameworkApps;

public class TestGenerics4  {  
	  
	   public static < E > void printArray(E[] elements) {  
		
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }
	   public void printIt(int i)
	   {
		   System.out.println(i);
	   }
	   public static < E > E test(E a)
	   {
		   return (a);
	   }
	    public static void main( String args[] ) {  
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'J', 'A', 'V', 'A', 'O','O','P','L'};  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	        
	        String s[]={"India","USA","Canada","UK"};
	        System.out.println("priting string array");
	        printArray(s);
	      //  printArray("haiie");
	        System.out.println(test(98));
	        System.out.println(test("haiie"));
	        }
	    }   
