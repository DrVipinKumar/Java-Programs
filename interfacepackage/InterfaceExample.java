package interfacepackage;
interface A
{
	void displayAMsg();
	void setAMsg(String msg);
}
interface B
{
	void displayMsg(String msg);
}
interface C extends A, B
{
	void displayMsg(String msg);
}
class ABC implements A,B,C
{
    String msg;
	@Override
	public void displayAMsg() {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	@Override
	public void setAMsg(String msg) {
		// TODO Auto-generated method stub
		this.msg=msg;
		
	}

	@Override
	public void displayMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a1 =new ABC();
		a1.setAMsg("This is my A interface");
		a1.displayAMsg();
		a1.displayMsg("This is my B & C Inteface Msg");
		A ia=a1;
		ia.setAMsg("This is by A Interface");
		ia.displayAMsg();
		
		B ib=a1;
		ib.displayMsg("This is by B Interface");
		C ic=a1;
		ic.displayMsg("This is by C interface");

	}

}
