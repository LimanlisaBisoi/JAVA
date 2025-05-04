//Write a java program to print the multiplication table of a number entered by the user.
import java.util.*;
public class QUE_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to show the multiplication table: ");
		int n=sc.nextInt();
		System.out.println("The multiplication table of "+n+" is: ");
		for (int i=1;i<11;i++){
		System.out.println(n+" x "+i+" = "+(n*i));

	}
  }
}
