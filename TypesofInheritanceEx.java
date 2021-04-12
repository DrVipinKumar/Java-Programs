class A1
{
	A1()
	{
		System.out.println("This is A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("This is B1");
	}
}
/*
class C1 extends A1, B1  //multiple inheritance -> not supported
{
	
}*/
class D1 extends B1  //Multilevel inheritance -> supported 
{
	D1()
	{
		System.out.println("This is D1");
	}
}
public class TypesofInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 b1 =new D1();
	}

}
