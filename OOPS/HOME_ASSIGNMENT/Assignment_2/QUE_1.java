/*Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of
  years and days for the minutes. For simplicity, assume a year has 365 days. 
Here is a sample run:
Enter the number of minutes: 1000000000 
1000000000 minutes is approximately 1902 years and 214 days.    */
import java.util.Scanner;
public class QUE_1 {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the minutes:");
		int min = ob.nextInt();
		int year = min/525600;
		int days = (min%525600)/1440;
		System.out.println(min+" minutes is approximately "+year+" years and "+days+" days. ");
		ob.close();
		
	}
}
