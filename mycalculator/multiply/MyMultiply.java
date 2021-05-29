package mycalculator.multiply;

public class MyMultiply {
	int num1, num2;
	public MyMultiply(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void getMul()
	{
		System.out.println("Multipilication of two number="+(num1*num2));
	}
}
