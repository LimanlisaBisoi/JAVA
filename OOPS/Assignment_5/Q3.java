/*WAP to enter the first number and second number. Display the prime numbers between the 
first and second number.                                         */
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a =ob.nextInt();
		System.out.print("Enter the second number: ");
		int b =ob.nextInt();
		System.out.print("The prime numbers between "+a+" and "+b+" are ");
		int i,j;
		for(i=a;i<=b;i++) {
			for(j = 2;j<i;j++) 
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.print(i+" ");
			
		}
	}
}
