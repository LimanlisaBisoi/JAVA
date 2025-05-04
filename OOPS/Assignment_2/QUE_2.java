// The distance between two cities (in km.) is input through the keyboard. Write a java program
	//	to convert and print this distance in meters, feet, inches and centimetres.
//Answer:-
import java.util.Scanner;
public class QUE_2 {

	public static void main(String[] args) 
	{
      Scanner Sc = new Scanner(System.in);
      System.out.print("Enter the KM:");
      double  a=Sc.nextDouble();
      double b = a*1000;
      double c = a*3280.8399;
      double d = a*100000;
      double e = a*39370.0787;
      System.out.println("Distance in Meters = "+b);
      System.out.println("Distance in Feet = "+c);
      System.out.println("Distance in Centimeters = "+d);
      System.out.println("Distance in Inch = "+e);
	}

}
