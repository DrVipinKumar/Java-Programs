/*
 * Encapsulation: 
 * 1. It is OOP technique in which we define private variables
 * in a class and access those privates variables by using public methods. 
 * 2. These public methods are getter and setter methods. 
 * 3. getter methods starts with get prefix, and setter methods are starts with
 *    set prefix. 
 * 4. getter methods are read only, setter methods are write only. 
 * 5. Encapsulation provides data hiding and data abstraction concepts. 
 * 
 */
class StudentInfo
{
	private String name,section, semester; //read only properties
	private int percentage;//read and write properties
	StudentInfo(String name, String section, String semester, int percentage)
	{
		this.name=name;
		this.section=section;
		this.semester=semester;
		this.percentage=percentage;
	}
	public String getName()  //read only properties
	{
		return name;
	}
	public String getSection()//read only properties
	{
		return section;
	}
	public String getSemester()//read only properties
	{
		return semester;
	}
	public int getPercentage() //read only properties
	{
		return percentage;
	}
	public void setPercentage(int p)//write only properties
	{
		percentage=p;
	}
	
	
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1 =new StudentInfo("Ravi Kumar","C","2nd",80);
		System.out.println("Name="+s1.getName());
		System.out.println("Semester="+s1.getSemester());
		System.out.println("Section="+s1.getSection());
		System.out.println("%tage="+s1.getPercentage());
		
		StudentInfo s2 =new StudentInfo("Rahul Kumar","C","2nd",80);
		System.out.println("Name="+s2.getName());
		System.out.println("Semester="+s2.getSemester());
		System.out.println("Section="+s2.getSection());
		s2.setPercentage(90);
		System.out.println("%tage="+s2.getPercentage());
	}

}
