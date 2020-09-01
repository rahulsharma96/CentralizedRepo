
public class class2 {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is"+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int z;
		z=a-b;
		System.out.println("Subtraction is"+z);
		return z;
	}
	
	public void mul(int a, int b)
	{
		int r;
		r=a*b;
		System.out.println("final result is "+r);
		
	}	
	public static void main(String[] args) {
		class2 obj = new class2();
		int sum_result = obj.sum(10,2);
		int sub_result = obj.sub(10,2);
		obj.mul(sum_result,sub_result);
		
		
	}
}
