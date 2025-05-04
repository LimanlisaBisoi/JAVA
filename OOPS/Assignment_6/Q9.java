/*Some websites impose certain rules for passwords. 
Write a method that checks whether a string is a valid password. Suppose the password rules 
are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits. 
Write a program that prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise.               */
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String pw = sc.nextLine();
		System.out.println((isValidPassword(pw)?" valid":"invalid")+" password");
	}
	public static boolean isValidPassword(String password) {
		boolean validPassword = (password.length()>=8 && onlyLettersAndDigits(password) && atleastDigits(password));
		return validPassword;
	}
	
	public static boolean onlyLettersAndDigits(String password) {
		for(int i=0;i<password.length();i++) {
			int a = (int)password.charAt(i);
		if(!(a>=48 && a<=57) || (a>=65 && a<=90) || (a>97 && a<=122))
		{
			return false;
		}
	  }
		return true;
	}
	
	public static boolean atleastDigits(String password) {
		int count = 0;
		for(int i=0;i<password.length();i++) {
			int a = (int)password.charAt(i);
		if(a>=48 && a<=57)
				count++;
		if (count>=2)
		{
			return true;
		}
	}
		return false;
	}	
}
