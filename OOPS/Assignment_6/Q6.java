/*Write a method that finds the number of occurrences of a specified character in a string using 
the following header:
public static int count(String str, char a)
For example, count ("Welcome", 'e') returns 2. 
Write a java program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string                                         */
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		System.out.println("The character\'"+ch+"\' in the word\" "+s+"\" is:"+count(s,ch));
	}
	public static int count(String str,char c) {
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)==c)
				count++;
	}
	         return count;
  }
}
