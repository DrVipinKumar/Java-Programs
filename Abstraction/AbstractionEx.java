package Abstraction;
import java.util.Scanner;
/*
 * What is Abstraction?
 * Ability of an object to show only necessary information to the user and hide
 * un necessary information from user. 
 * In java, there are two ways to achieve abstraction: 
 * 1. Abstract Class: (0 to 100) % Abstraction
 * 2. Interface: 100 % Abstraction
 * What is Abstract Class: 
 * 1. Abstract class is a class that object can not be directly instantiated
 * 2. You can not create object of Abstract Directly
 * 3. Abstract class may have zero or more abstract methods
 * 4. if a class have any abstract method then class must be declared abstract.
 * 5. Abstract class is born to be inherited.
 * What is Interface?
 * 1. Interface is pure abstract class, (can not be directly instantiated)  
 * 2. Pure abstract means all abstract method. 
 * 3. All methods in interface are public, and abstract by default
 * 4. All variables are public, static, and final by default
 */
interface IArea
{
	double PI=3.14;
	void getArea(int l, int b);//public>default public>protected>private
	void getArea();
	
}
class ICircle implements IArea
{
	int r;
	ICircle(int r)
	{
		this.r=r;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle="+(IArea.PI*r*r));	
	}

	@Override
	public void getArea(int l, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
class IRectangle implements IArea
{
	
	@Override
	public void getArea(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle="+(l*b));	
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}
}
abstract class Area
{
	int l, b;
	int r;
	void display()  //50% Abstract
	{
		System.out.println("Hello This is Abstract class normal method");
	}
	abstract void getArea();//Method without body is called abstract method
}
class Rectangle extends Area
{
	
	Rectangle(int l, int b)
	{
		super.l=l;
		super.b=b;
	}
	
	@Override
	void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle="+(super.l*super.b));	
	}
}
class Circle extends Area
{
	
	Circle(int r)
	{
		super.r=r;
	}
	
	@Override
	void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle="+(IArea.PI*super.r*super.r));	
	}
}
public class AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.nextLine();
		System.out.println("Your Name="+name);*/
		Rectangle r1 =new Rectangle(23,45);
		r1.getArea();
		Circle c1 =new Circle(23);
		c1.getArea();
		Area a1 =new Rectangle(34,45);
		a1.getArea();
		a1.display();
		IRectangle ir1 = new IRectangle();
		ir1.getArea(3, 4);
		ICircle ic1 =new ICircle(34);
		ic1.getArea();
		IArea ia=new IRectangle();
		ia.getArea(34,56);
	}

}
