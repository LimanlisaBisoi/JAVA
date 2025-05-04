/*Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's algorithm, 
 which is an iterative computation based on the following observation: if y divides x, the GCD of x and y 
 is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
Sample run:
Enter the first number: 56
Enter the second number: 98    GCD of 56 and 98 is 14.                                       */

import java.util.Scanner;
public class QUE_4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int x= sc.nextInt();
		System.out.println("Enter second number");
		int y =sc.nextInt();
		int b=Math.min(x,y);
		int a=Math.max(x,y);
		while (a%b !=0){
		int r=a%b;
		a=b;
		b=r;
		System.out.println("GCD is ="+b);
        sc.close();
	}
  }
}
/*                                   OTHERWISE.................
System.out.println("Enter first number");
int x = sc.nextInt();
System.out.println("Enter second number");
int y = sc.nextInt();
while (y !=0){
int temp = y;
y = x % y;
x = temp;
System.out.println("GCD is ="+x);
}                                                         */
