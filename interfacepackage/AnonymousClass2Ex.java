package interfacepackage;
interface Divide  //Functional Interface
{
	void getDivision(int n1, int n2);
	
}

public class AnonymousClass2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Divide d1 = new Divide() {//anonymous class

			@Override
			public void getDivision(int n1, int n2) {
				// TODO Auto-generated method stub
				System.out.println("Division of two number="+(n1/n2));
			}

	};
	d1.getDivision(314,56);
	//Lambda Expression
	Divide d2 =(int n1, int n2)->System.out.println("Division of two number="+(n1/n2));		
	d2.getDivision(344, 34);

}
}
