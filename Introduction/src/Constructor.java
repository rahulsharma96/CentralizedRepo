public class Constructor 
{
	public Constructor()
	{
		this(45);  //this will call one parametrized 
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a)
	{
		this(45,4); //this will go to two parametrized 
		System.out.println("One Parametrized Constructor");
	}
	public Constructor(int a,int b)
	{
		System.out.println("Two Parametrized Constructor");
	}
	
	public static void main(String[] args)
	{
		Constructor Cs = new Constructor();
	}	
}
