package CollectionFrameworkApps;
import java.util.*;  
abstract class Shape
{  
abstract void draw();  
}  
class Rectangle extends Shape{  
@Override
void draw(){System.out.println("drawing rectangle");}  
public String toString()
{
	return "hello, im from rectangle object";
}
}  
class Circle extends Shape{  
@Override
void draw(){System.out.println("drawing circle");}  
public String toString()
{
	return "hello, im from Circle object";
}
}  

class GenericTest {  
//creating a method that accepts only child class of Shape  

	public static void drawShapes(List<? extends Shape> lists){  
for(Shape s:lists){  
s.draw();//calling method of Shape class by child class instance  
} 
}
public static void main(String args[]){  
List<Rectangle> list1=new ArrayList<Rectangle>();  
list1.add(new Rectangle());  
list1.add(new Rectangle());
//list1.add(new String("you try it"));
List<Circle> list2=new ArrayList<Circle>();  
list2.add(new Circle());  
list2.add(new Circle());   
drawShapes(list1);  
drawShapes(list2);  
List<String> list3=new ArrayList<String>();
list3.add("hai");
//drawShapes(list3);
System.out.println(list1);
System.out.println(list2);
}
}  