
public class Assignment2 {

	public Assignment2() 
	{
		this(4,5,15,6);
		System.out.println("default constructor");
	}
	public Assignment2(int a)
	{
		System.out.println("One parametrized constructor");
	}
	public Assignment2(int a, int b)
	{
		
		System.out.println("Two parametrized constructor");
	}
	public Assignment2(int a, int b, int c)
	{
		this(4);
		System.out.println("Three parametrized constructor");
	}
	public Assignment2(int a, int b, int c, int d)
	{
		this(23,45,5);
		System.out.println("Four parametrized constructor");
	
	}
	
	public static void main(String[] args) 
	{
		Assignment2 m1 = new Assignment2();
		

	}
	
}
