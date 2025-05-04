/* Make a simple game involving a computer and a user. The computer first guesses a 
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and 
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is 
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”. */
import java.util.Scanner;
public class QUE_4 {

	public static void main(String[] args) {
    System.out.println("Enter user no.:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 1+(int)(9*Math.random());
    System.out.println("Computer guess:"+b);
    if(a==b) {
    	System.out.println("You got it right");
    }
    else if(a-b==+1||a-b==-1) {
    	System.out.println("Almost got it");
    }
    else System.out.println("You got it wrong");

	}

}
