/*Write java method called count accepts a string as input and returns the number of vowels in 
it. The method header is given below.      public static int count(String str)
For example, count ("Welcome") returns 2.                                      */
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println("Number of vowellsin the given word is: "+count(s));
	}
		public static int count(String str) {
			int vowel = 0;
			for(int i=0;i<=str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u')
					vowel++;
             	}
			return vowel;
     }
}
