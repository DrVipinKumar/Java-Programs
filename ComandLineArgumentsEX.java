public class ComandLineArgumentsEX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		 String data="";
		if(args.length>0)
		{
		for(int i=0;i<args.length;i++)
		//for(String data:args)
		{
				data=args[i];
				sum=sum+Float.parseFloat(data);
				
		}
		System.out.println(sum);
		}
		else
		{
			System.out.println("You did not pass any command line argument");
		}
	}

}
