
public class rahul 
{
	public rahul() {
		this(2,2,5,6);
		System.out.println("default constructor");
	}
	public rahul(int a){
		this();
		System.out.println("one parametrized constructor");
	}
	public rahul(int a, int b)
	{
		this(4,4,5);
		System.out.println("two parametrized constructor");
	}
	public rahul(int a, int b, int c)
	{
		this(3);
		System.out.println("three parametrized constructor");
	}
	public rahul(int a, int b, int c, int d)
	{

		System.out.println("four parametrized constructor");
	}
		public static void main(String[] args) {
			rahul r = new rahul(2,3);
			
		}
}

