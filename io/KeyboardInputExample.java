package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputExample {

	public static void main(String[] args) {
		double num1;
		// TODO Auto-generated method stub
		double num2;
		//double ac=10000.00;
		/*Double myac =new Double(ac);//boxing
		ac=ac+10000;
		ac=ac-12334;
		System.out.println(ac);
		ac=myac.doubleValue();//un-boxing
		System.out.println(ac);*/
       InputStreamReader input = new InputStreamReader(System.in);
       BufferedReader br =new BufferedReader(input);
       try {
    	System.out.println("Enter number 1");
		num1=Double.parseDouble(br.readLine());
		System.out.println("Enter number 2");
		num2=Double.parseDouble(br.readLine());
		System.out.println("Sum of two number is="+(num1+num2));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
