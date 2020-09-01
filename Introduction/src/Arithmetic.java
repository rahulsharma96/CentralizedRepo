
public class Arithmetic {

	public int sum(int a,int b)
	{
		int c;
		c=a + b;
		System.out.println("Sum result is" +c);
		return c;
		
	}
	public int sub(int a, int b)
	{
		int z;
		z= a-b;
		System.out.println("Sub result is" +z);
		return z;
	}
	public int mult(int a,int b) 
	{
		int q;
		q=a*b;
		System.out.println("multiplication is " +q);
		return q;
	}
	public int div(int a, int b)
	{
		int r;
		r=a/b;
		System.out.println("final answer is"+r);
		return r;
	}
	public static void main(String[] args) 
	{
		Arithmetic obj = new Arithmetic();
		int sum_result = obj.sum(10,2);
		int sub_result = obj.sub(sum_result,2);
		int mult_result = obj.mult(sub_result,2);
		int sum_result1 = obj.sum(mult_result,2);
		int div_result = obj.div(sum_result1,2);
		
		//(10+2)-2)*2)+2)/2)
		
	}
}
