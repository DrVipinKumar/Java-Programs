package exceptionhandling;

import java.util.Scanner;

/*
 * Exception: 
 * Abnormal condition that stop normal flow of execution of a program is called exception
 * Exception Handling: 
 * Steps to be follow to remove abnormal condition or exception in a program is called
 * Exception Handling
 * This exception handling provides robustness feature to Java. 
 * Types of Exception: 
 * 1. Checked Exception: Syntax Error, Compile Time Exception
 * 2. Un-Checked Exception: Run Time exception
 * Throwable ->  Exception->  1. Compile Time 2. Run time Exception
 *           ->  Error
 */
class Division
{
	int n1, n2, result;
	Division(int n1, int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void getDivision()
	{
		System.out.println("This is starting of division function");
		try {
		result=n1/n2;
		System.out.println("Division of two number is="+result);
		}
		catch(ArithmeticException ae)
		{
			//ae.printStackTrace();
			System.out.println(ae.getMessage());
			//System.out.println(ae.toString());
			//System.out.println("Divide by Zero");
		}
		finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("This is ending of division function");
	}
}
public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number 1=>");
		num1=input.nextInt();
		System.out.print("Enter number 2=>");
		num2=input.nextInt();
		Division d1 = new Division(num1,num2);
		d1.getDivision();
		System.out.println("This is end of my main function");
		input.close();
	}

}
