/*
 * Array: 
 * 1. It is collection of variable of similar data type
 * 2. Index value always start with=0
 * 3. Array is an object in Java
 * 4. Array is non-primitive data types
 * 5. Array is user defined data types
 */
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		num[0]=10;
		num[1]=11;
		num[2]=12;
		num[3]=13;
		num[4]=14;
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Value in array num at "+i+" index="+num[i]);
		}
		int data[]= {12,56,78,34,78};
		int i=0;
		for(int value:data)
		{
			System.out.println("Value in array data at "+i+" index="+value);
			i++;
		}
	}

}
