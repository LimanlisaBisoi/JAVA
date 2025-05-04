/* Write a java program that takes the x – y coordinates of a point in the Cartesian plane and prints 
a message telling either an axis on which the point lies or the quadrant in  which it is found.
Here is the sample output:        (-1.0, -2.5) is in quadrant III       ,(0.0, 4.8) is on the y-axis      */
import java.util.Scanner;
public class QUE_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = sc.nextDouble();
		System.out.print("Enter y: ");
		double y = sc.nextDouble();
		System.out.println("("+x+" ,"+y+") on the ");
		if(x>0 && y>0)
			System.out.print("1st quadrrant");
		else if(x<0 && y>0)
			System.out.print("2nd quadrrant");
		else if(x<0 && y<0)
			System.out.print("3rd quadrrant");
		else if(x>0 && y<0)
			System.out.print("4th quadrrant");
		else if(x!=0 && y==0)
			System.out.print("x axis");
		else if(x==0 && y!=0)
			System.out.print("y axis");
		else 
			System.out.print("origin");
	}
}
