//Class is a template for an Object.
//Class is a user define data type for creating Objects. 
class Multiply
{
	int num1, num2;
	//1. constructor is a special method that have same name as per
	//the name of your class. 
	//2.constructor is used to initialize variable of class
	//3. constructor does not return any value. 
	//4. constructor is used to create objects of class
	//5. Java provides default constructor:  without arguments
	Multiply(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	Multiply()
	{
		this.num1=0;
		this.num2=0;
	}
	void getMultiply()
	{
		int mul=num1*num2;
		System.out.println("Multiplication of two number="+mul);
	}
	void getMultiply(int...mul)
	{
		int m=1;
		for(int mm:mul)
		{
			m=m*mm;
		}
		System.out.println("Multiplication of two number="+m);
	}
}
class Sum
{
	int num1, num2;
	//Data types in Java: int,float, double, long, char, short, byte
	//boolean.  //primitive data types. 
	void getAddition()
	{
		int add=num1+num2;
		System.out.println("Sum of two number="+add);//concatenation
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 =new Sum();  //object creation and instantiation
		s1.num1=10;
		s1.num2=30;
		s1.getAddition();
		Sum s2;//Object creation
		s2=new Sum(); //Object instantiation
		s2.num1=40;
		s2.num2=50;
		s2.getAddition();
		Multiply m1 =new Multiply(24,56);
		m1.getMultiply();
		Multiply m2 =new Multiply();
		m2.getMultiply();
		m2.getMultiply(34,45,67);
	}

}
