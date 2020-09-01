import java.util.Scanner;

public class hw {
	
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is "+c);
		return c;
	}
	public int sub(int a, int b){
		int d;
		d=a-b;
		System.out.println("sub is"+d);
		return d;
	}
	public int mul(int a, int b){
		int q;
		q=a*b;
		System.out.println("mul is"+q);
		return q;
	}
	public int div(int a, int b){
		int s;
		s= a/b;
		System.out.println("final result is"+s);
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
		System.out.println("The value of a is"+a);		
		
		hw obj = new hw();
		int sum_result = obj.sum(a,a);
		int sub_result = obj.sub(sum_result, a);
		int sum_result1= obj.sum(sub_result,a);
		int mul_result = obj.mul(sum_result1,a);
		int div_result = obj.div(mul_result,a);
	}
}
