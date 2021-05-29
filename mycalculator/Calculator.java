package mycalculator;
import mycalculator.classes.MyDiv;
import mycalculator.classes.MySum;
import mycalculator.multiply.MyMultiply;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MySum s1=new MySum(23,45);
	       s1.getSum();
	       MyDiv d1=new MyDiv(123,45);
	       d1.getDiv();
	       MyMultiply m1=new MyMultiply(123,45);
	       m1.getMul();
	}

}
