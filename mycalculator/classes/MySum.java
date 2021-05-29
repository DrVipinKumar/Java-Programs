package mycalculator.classes;

public class MySum {
	int num1, num2;
		public MySum(int num1, int num2)
		{
			this.num1=num1;
			this.num2=num2;
		}
		public void getSum()
		{
			System.out.println("Sum of two number="+(num1+num2));
		}
	
}
