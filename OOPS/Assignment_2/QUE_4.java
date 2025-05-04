// Write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
//Answer:-
import java.util.Scanner;
public class QUE_4 {

	public static void main(String[] args) 
	{
		int n,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number between 0 and 1000 : "); 
		n = sc.nextInt();           //237
		int digit1 = n%10;          //7
		sum = sum + digit1;         //0+7=7
		n = n/10;                   //237/10=23
		int digit2 = n%10;          //23%10=3
		sum = sum + digit2;         //7+3=10
		n = n/10;                   //23/10=2
		int digit3  = n%10;         //2%10=2
		sum = sum + digit3;
		System.out.println("The sum of the digit is "+sum);

	}

}
