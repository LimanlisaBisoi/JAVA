/*Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is 
the same as itself. Write a java program that prompts the user to enter an integer and reports 
whether the integer is a palindrome .                                                    */
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		System.out.println(n+" "+(isPalindrome(n)?"is":"is not")+" a palindrome number");
	}
	public static int reverse(int number) {
		int rev = 0;
		while(number>0)
		{
			int r = number%10;
			rev = rev*10+r;
			number/=10;
		}
		return rev;
	}
   public static boolean isPalindrome(int number) {
	   if(number == reverse(number))
		   return true;
	   else return false;
   }
}
