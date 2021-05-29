package exceptionhandling;
class Voter
{
	int age;
	Voter(int age)
	{
		this.age=age;
	}
	boolean checkAge() throws Exception 
	{
		if(age<18)
		{
			throw new Exception("Age should be geater than 18");
			
		}
		else
		{
			return true;
		}
				
	}
	void checkValidity() throws Exception 
	{
		if(checkAge())
		{
			System.out.println("You can vote");
		}
		
	}
}
public class CustomException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        Voter v=new Voter(19);
        
        try {
			v.checkValidity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		

}
}
