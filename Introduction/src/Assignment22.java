import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		 int x,y,z;
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the value of x and y ");
			
		  x = s.nextInt();
		  y= s.nextInt();
		
		System.out.println("before swapping number are " +x +"  " +y);
		z = x;
		x = y;
		y = z;
		System.out.println("After swapping numbers are " +x +"  " +y);
		
	}

}
