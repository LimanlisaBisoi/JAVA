/*Write a recursive Java method that takes a character string s and outputs its
  reverse. For example, the reverse of ' pots&pans' would be ' snap&stop'. */
import java.util.*;
public class Q10 {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String reversed = reverse(s);
        System.out.println("Reversed string: " + reversed);

    }
    public static String reverse(String s) {
        if (s.isEmpty()) 
            return s;
        
            return reverse(s.substring(1)) + s.charAt(0);
    }
}
