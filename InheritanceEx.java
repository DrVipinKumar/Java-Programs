/* Inheritance: 
 * 1. It is OOP concept, in which we create new class from existing class.
 * new class is called sub class and existing class is called super class
 * , sub class inherit properties and behavior of super class
 * 2. By low of inheritance: All the member of super class/existing is the member
 *    of sub class. 
 * 3. For inheritance we use extends keyword
 * 4. Re-Usability is the advantage of Inheritance
 * 5. Extendibility is also use of Inheritance 
 */
class A
{
	String msg="Hello I am in A class";
	void getMsg()
	{
		System.out.println(msg);
	}
}
class B extends A   //Inheritance
{
	void getBMsg()
	{
		System.out.println("This is new msg by Class B");
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 =new B();
		b1.msg="This is my msg by Class B";
		b1.getMsg();
		b1.getBMsg();
	}

}
