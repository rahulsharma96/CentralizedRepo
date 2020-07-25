public class Assignment1 {

	
	public int sum(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("additon is "+c);
		return c;
	}
	public int sub(int x,int y)
	{
		
		System.out.println("subtraction is "+(x-y));
		return x-y;
	}
	public int mult(int p,int q)
	{
		
		System.out.println("mult is "+p*q);
		return p*q;
	}
	public int sum1(int r, int s)
	{	
		System.out.println("final addition is "+(r+s));
		return r+s;
	}
	public int div(int t, int u)
	{
		System.out.println("answer is"+u);
		return u;
	}
	 		public static void main(String[] args) 
	 		{
	 			//((((10+2)-2)*2)+2)/2)
	 			
	 			Assignment1 obj = new Assignment1();
	 			int add= obj.sum(10,2);
	 			int subtraction = obj.sub(add,2);
	 			int multiplication=obj.mult(subtraction,2);
	 			int adddition = obj.sum1(multiplication,2);
	 			int division = obj.div(adddition,2);
	 		
	 		}
	}
