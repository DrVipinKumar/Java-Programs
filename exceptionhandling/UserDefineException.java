package exceptionhandling;

@SuppressWarnings("serial")
class CheckAgeException extends Exception
{
	String msg;
	CheckAgeException(String msg)
	{
		//super(msg);
		this.msg=msg;
	}
	
	public String toString()
	{
		return msg;
	}
	
}
class CanVote
{
	
	void checkAge(int age) throws CheckAgeException
	{
		if(age<18)
		{
			throw new CheckAgeException("Your Age Should be greater than 18");
		}else
		{
			System.out.println("You can vote");
		}
	}
}
public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CanVote v =new CanVote();
      try {
		v.checkAge(32);
	} catch (CheckAgeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.toString());
	}
	}

}
