package interfacepackage;
interface Sum
{
	void getSum(int n1, int n2);
	void getSum(int n1, int n2, int n3);
}
class MySum implements Sum
{

	@Override
	public void getSum(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("Sum of two number="+(n1+n2));
	}

	@Override
	public void getSum(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		System.out.println("Sum of two number="+(n1+n2+n3));
	}
	
}
public class AnonymousClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySum s1 =new MySum();
		s1.getSum(34,56);
		Sum ss1=new Sum() {//Anonymous Class

			@Override
			public void getSum(int n1, int n2) {
				// TODO Auto-generated method stub
				System.out.println("Sum of two number="+(n1+n2));
			}

			@Override
			public void getSum(int n1, int n2, int n3) {
				// TODO Auto-generated method stub
				System.out.println("Sum of three number="+(n1+n2+n3));
			}

	};
	ss1.getSum(34,56, 67);
	ss1.getSum(34,56);
}
}
