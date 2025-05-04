//Write a java method to check a string is palindrome or not.
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(s+(isPalindrome(s)?" is":" is not")+" a palindrome string");
	}
	public static boolean isPalindrome(String str) {
		int left = 0,right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++; right--;
		}
		return true;
	}
}
