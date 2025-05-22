/*Write a Java program to read your lucky number from keyboard. Treat –ve no. 
  as NumberFormatException. Write appropriate Exceptional handler.  */
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your lucky number: ");
		int n=sc.nextInt();
		try {
		if(n<0) {
			throw new NumberFormatException ("Negetive number");
		}
		System.out.println("Your lucky no. is "+n);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			   	}
	}
}
/*           OR YOU CAN DO THIS
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your lucky number: ");
		int n=sc.nextInt();
		try {
		if(n<0) {
			throw new NumberFormatException ("Negetive number");
		}
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println("Please Ignore...");
			System.out.println("Your lucky no. is "+n);
			   	}
	}
}                                                                   */
