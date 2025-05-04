/* WAP to calculate and display the factorial of all numbers between m and n (where m < n, m 
> 0, n > 0)
Sample run:
Enter the value of m: 2  Enter the value of n: 5   Factorial of 2 is: 2  Factorial of 3 is: 6
Factorial of 4 is: 24     Factorial of 5 is: 120                                */
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of m: ");
	int m =sc.nextInt();
	System.out.print("Enter the value of n: ");
	int n =sc.nextInt();
	if(m<n)
	
		for(int i=m;i<=n;i++)
		{
		   int fact=1;
		   for(int j=1;j<=i;j++)
		   {
			   fact*=j;
		   }
		   System.out.println("Factorial of "+i+" is: "+fact);
		}
	}

}
