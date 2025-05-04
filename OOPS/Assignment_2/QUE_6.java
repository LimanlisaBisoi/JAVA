// When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The distance it travels is given by d = (1/2) gt2
//	Here d is in feet, t is the time in seconds, and g is 32.174.
//	Write a program that asks the user for the number of seconds and then prints out the distance travelled.
//Answer:-
import java.util.Scanner;
public class QUE_6 {

	public static void main(String[] args) 
	{
		double d,t;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of seconds ");
		t = ob.nextDouble();
		d = (1.0/2)*32.174*Math.pow(t,2);
		System.out.println("Distance travelled "+d);

	}
}
