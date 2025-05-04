/*Write a java program that reads a Fahrenheit degree in a double value from the console,then converts it to
  Celsius and displays the result.		*/

import java.util.Scanner;
public class QUE_1 {

	public static void main(String[] args)
	{
	    Scanner ob= new Scanner(System.in);
	    System.out.print("Enter the degree in Fahrenheit: ");
	    double F=ob.nextDouble();
	    double C=(F-32)*(5.0/9);
	    System.out.println(F+" Fahrenheit is "+C+" Celcious");
	    ob.close();

	}

}
