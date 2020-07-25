
public class thisSecond {
  
	public int sub(int a,int b) 
	{
		int c;
		c=a-b;
		System.out.println("additon is "+c);
		return c;
	}
	public int sub1(int x,int y)
	{
		
		System.out.println("subtraction is "+(x-y));
		return x-y;
	}
	public int sum(int p,int q)
	{
		
		System.out.println("sum is "+p+q);
		return p+q;
	}

	public int subbt (int w,int o)
	{
		System.out.println("subtraction is"+(w-o));
		return w-o;
	}
	
	public void div(int t, int u)
	{
		System.out.println("answer is"+u);

	}
	 		public static void main(String[] args) 
	 		{
	 			//((((10-2)-2)+2)-2))/2)
	 			
	 			Assignment1 obj = new Assignment1();

	 			int subtraction = obj.sub(10,2);
	 			int subt= obj.sub(subtraction,2);
	 			int add = obj.sum(subt,2);
	 			int minus = obj.sub(add, 2);
	 			int divide = obj.div(minus,2);
	 			
	 		}
	
}
