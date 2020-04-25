package CollectionFrameworkApps;

class Fan
{
	final int SLOW=1, MEDIUM=2, FAST=3;
	private int speed=SLOW;
	boolean on=false;
	private double radius=5;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String color="blue";
	public Fan() {
	}
	@Override
	public String toString()
	{
		if(on)
		return " Fan Speed is: "+getSpeed()+". Color is: "+getColor()+". Radius is: "+getRadius();
		else
		return " Fan Color is: "+getColor()+". Fan Radius is: "+getRadius()+". Fan is Off";
	}
}
public class Exercise_9_8 {

	public static void main(String[] args) {
Fan f1=new Fan();
f1.setSpeed(f1.FAST);
f1.setRadius(10);
f1.setColor("Yellow");
f1.setOn(true);


Fan f2=new Fan();
f2.setSpeed(f2.MEDIUM);
f2.setRadius(5);
f2.setColor("blue");
f2.setOn(false);
System.out.println(f2.getRadius());
System.out.println("Fan one is: "+f1);
System.out.println("Fan Two is: " +f2);
	}

}
