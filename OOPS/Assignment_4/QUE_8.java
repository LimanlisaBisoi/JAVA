/*Write a program that generates a random integer number between 1 to 10 and asks the user to 
guess what the number is. If the user's guess is higher than the random number, the program 
should display "Too high, try again." If the user's guess is lower than the random number, the 
program should display "Too low, try again." The program should use a loop that repeats until 
the user correctly guesses the random number and display good guess.              */
import java.util.*;
public class QUE_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user,comp;
		do{
		comp=(int)(Math.random()*9+1);
		System.out.println("Enter the user number :");
		user=sc.nextInt();
		System.out.println("Computer Guess :"+comp);
		System.out.println("User Guess :"+user);
		if (user>comp){
		System.out.println("Too high, try again");
		}else if(user<comp){
		System.out.println("Too low, try again");
		}else{
		System.out.println("Good Guess");
		}
		}
		while(user!=comp);
	}
}

