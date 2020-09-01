import java.util.Scanner;

public class armstrong {

	public static void main(String[] args)  {  
	    int c=0,a,temp;  
	    int n;//It is the number to check armstrong  
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
	    temp=n; 
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println(" It is an armstrong number ");   
	    else  
	        System.out.println("It is not an armstrong number");   
	   }  
}
