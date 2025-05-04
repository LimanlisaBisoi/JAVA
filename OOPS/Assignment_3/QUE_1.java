/* Write a program to input the age of a person and check if the age of the person is greater than or 
 equal to 18 then print the message: “You are eligible to cast your vote”.                           */
import java.util.Scanner;
public class QUE_1 {

	public static void main(String[] args) {
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x>=18)
		{
			System.out.println("You are eligible to cast your vote.1818");
		}
	}
}
