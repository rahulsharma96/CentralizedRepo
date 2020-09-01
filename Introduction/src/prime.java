
public class prime {

	 public static void main(String[] args) {

		 int Rahul =0;
		 int num = 5;
		 int half =num/2;
	for(int i=2;i<=half;i++)
	{
		if(num%i==0)
		{
			System.out.println("It is not a prime no"+num);
			Rahul=1;
			break;
		}
		
	}if(Rahul==0)
	{
		System.out.println("It is a prime no"+Rahul);
	}
	 
	 }
}