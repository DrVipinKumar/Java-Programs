class Addition
{
	//Method Overloading
	int getSum(int num1, int num2)
	{
		return (num1+num2);
	}
	int getSum(int num1, int num2, int num3)
	{
		return (num1+num2+num3);
	}
	float getSum(float num1, float num2)
	{
		return (num1+num2);
	}
	
	
}
public class MethodOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad1 =new Addition();
		System.out.println("Sum of two number="+ad1.getSum(30, 40));
		System.out.println("Sum of 3 number="+ad1.getSum(30, 40,45));
		System.out.println("Sum of two number="+ad1.getSum(30.5f, 40.6f));
	}

}
