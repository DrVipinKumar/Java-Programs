package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class ArrayEx
{
	Scanner input=new Scanner(System.in);
	int values[]=new int[5];
	void insertData()
	{
		System.out.println("Enter values in Array");
		try {
		for(int i=0;i<5;i++)
		{
			values[i]=input.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException ae) //propagation
		{
			//ae.printStackTrace();
			System.out.println("Length of array is less as compare to values entered");
		}
		catch(InputMismatchException ae)
		{
			//ae.printStackTrace();
			System.out.println("Wrong value entered");
		}
		
	}
	void displayData()
	{
		System.out.println("Values in Array are");
		try {
		for(int i=0;i<5;i++)
		{
			System.out.println(values[i]);
		}
		}catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Length of array is less as compare to values entered");
		}
	}
}
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEx a1 =new ArrayEx();
		a1.insertData();
		a1.displayData();
	}

}
