/*Write a Java program that takes a year from user and print true if that year is a leap year 
otherwise print false.                                                             */

import java.util.Scanner;
public class QUE_5 {

	public static void main(String[] args) {
		System.out.print("Input the year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4 ==0 && year%100!=0 || year%400==0) {
			System.out.println(year+" is a leap year: True");
		}
		else 
		System.out.println(year+" is a leap year: False");
	}

}
