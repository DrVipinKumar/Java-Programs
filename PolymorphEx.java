/*
 * ability of an object to have multiple form is called polymorphism
 * Polymorphism is combination of two words: 
 *             poly => many
 *             morph=> forms
 * Types of polymorphism: 
 * 	1. compile time: method overloading
 *  2. run time: method overriding
 * upcasting and downcasting in java: 
 * is also example of polymorphism: 
 */
class Employee
{
	String name;
	String department;
	Employee(String name, String department)
	{
		this.name=name;
		this.department=department;
	}
	void getEmployeeInfo()
	{
		System.out.println("Name="+name);
		System.out.println("Department="+department);
	}
	void getSalary()
	{
		
	}
}
class Salary extends Employee
{
	int payment;
	Salary(String name, String department, int payment)
	{
		super(name,department);
		this.payment=payment;
	}
	void getSalary()
	{
		super.getEmployeeInfo();
		System.out.println("Salary="+payment);
	}
}
public class PolymorphEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee("Rahul Kumar","CS");
		e1.getEmployeeInfo();
		Salary s1 =new Salary("Ravi Kumar","IT",40000);
		s1.getSalary();
		Employee e2 =new Salary("Amit Kumar","MCA",30000);//upcasting
		e2.getSalary();
		//Salary s2=new Employee("Ravi Tyagi","MCA");//downcasting
		//s2.getSalary();
	}
//upcasting: creating object of super class using sub class constructor
//downcasting: creating object of sub class using super class constructor
}
