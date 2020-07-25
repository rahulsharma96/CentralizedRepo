
public class Arithmetic {

	public int sum(int a,int b)
	{
		int c;
		c=a + b;
		System.out.println("Sum result is" +c);
		return c;
		
	}
	public int sub(int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("Sub result is" +z);
		return z;
	}
	public void mult(int a,int b) 
	{
		int c;
		c=a*b;
		System.out.println("final result is " +c);
	}
	public static void main(String[] args) 
	{
		Arithmetic obj = new Arithmetic();
		int sum_result = obj.sum(10,2);
		int sub_result = obj.sub(55,46);
	 obj.mult(sum_result,sub_result);
		
	}
}
