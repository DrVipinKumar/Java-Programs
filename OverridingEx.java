class Area
{
	Area(String msg)
	{
		System.out.println("I am in Super Class Constructor");
	}
	int l,b,r;
	int getArea()
	{
		return 0;
	}
}
class Rectangle extends Area   //Inheritance
{
	
//All the member of super class is the member of sub class.
	  Rectangle(int l , int b)
	  {
		  super("abc");
		  super.l=l;
		  super.b=b;
	  }
	  int getArea()   //Method overriding  
	  {
	//declaring a method is sub class with same signature as declared in
		  //super class. 
		  
		  return (l*b);
	  }
	  int getArea(int l, int b)  //Method overloading
	  {
		  return (l*b);
	  }
}
public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle r1 =new Rectangle(23,45);
//Sub class constructor implicitly called super class default constructor
			System.out.println("Area of Rectangle="+r1.getArea());
			System.out.println("Area of Rectangle="+r1.getArea(23,56));
			Rectangle r2 =new Rectangle(23,67);
			System.out.println("Area of Rectangle="+r2.getArea());
			System.out.println("Area of Rectangle="+r2.getArea(23,56));
	}

}
