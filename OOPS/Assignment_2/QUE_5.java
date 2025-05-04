// Write a java program that reads the radius of a hemisphere and computes the surface area and volume
// using the following formulas:Surface Area of Hemisphere = 3 π r2. Volume of a hemisphere = (2/3)πr3
//Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of thehemisphere. Hint: Use Math.PI.
import java.util.Scanner;
public class QUE_5 {

	public static void main(String[] args) 
	{
	  double r,sa,vol;
	  Scanner ob = new Scanner(System.in);
	  System.out.println("Enter the radius: ");
	  r = ob.nextDouble();
	  sa = 3*Math.PI*Math.pow(r,2);
	  vol = (2.0/3)*Math.PI*Math.pow(r,3);
	  System.out.println("Surface Area of Hemisphere is "+sa);
	  System.out.println("Volume of Hemisphere is "+vol);

	}

}
