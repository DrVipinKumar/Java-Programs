package mycalculator.classes;

public class MyDiv {
	int num1, num2;
	public MyDiv(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void getDiv()
	{
		System.out.println("Division of two number="+(num1/num2));
	}
}
