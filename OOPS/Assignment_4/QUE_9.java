/*Write a java program to take an integer input from the user and print the input by removing all zeros. 
Example: Input = 10200 then Output = 12.                                */

import java.util.Scanner;
public class QUE_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = sc.nextInt();
		int m=num,r=0,d,c=0;
		while (num>0)
		{
		d=num%10;
		if (d!=0)
		{
		r=r+d*(int)Math.pow(10,c);
		c++;
		}
		num=num/10;
		}
		System.out.println("After removing 0 from number "+ m+","+" the new number is "+r);
	}
}
/*                         OTHERWISE.............
Scanner sc = new Scanner(System.in);
System.out.println("Enter an integer number");
int num = sc.nextInt();
String str = Integer.toString(num);
str=str.replace("0", " ");
int newNum = Integer.parseInt(str);
System.out.println("After removing 0 from number "+ num+","+" the new number is "+newNum);
*/