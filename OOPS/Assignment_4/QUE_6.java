/* Write a java program to enter two numbers through the keyboard. Write a program to find the 
value of one number raised to the power of another. (Do not use Java built-in method).
Sample run:
Enter the base: 5   ,Enter the power: 4     ,5 to the power 4 is: 625                     */
import java.util.Scanner;
public class QUE_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		int n=sc.nextInt();
		int b=n;
		System.out.println("Enter the power :");
		int p=sc.nextInt();
		for(int i=1;i<p;i++)
		b*=n;
		System.out.println(n+" to the power "+p+" is : "+b);

	}
}
