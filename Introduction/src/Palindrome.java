import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]){  
		  int r,n,sum=0,temp;    
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("It is a palindrome number ");    
		  else    
		   System.out.println("It is not a palindrome");    
		}  
	
	
}
