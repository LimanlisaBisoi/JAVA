/*Write a program that reads three integers from the user and prints "Increasing" if the numbers are 
 in increasing order, "Decreasing" if the numbers are in decreasing order, and "Neither increasing nor 
 decreasing order" otherwise.                    */
import java.util.Scanner;
public class QUE_3 {

	public static void main(String[] args) {
		System.out.println("Input first number:");
		System.out.println("Input second number:");
		System.out.println("Input third number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b & b<c){
			System.out.println("Increasing");
		}
		else if(a>b & b>c){
			System.out.println("Decreasing");
		}
		else System.out.println("Neither Increasing nor Decreasing");
	}

}
