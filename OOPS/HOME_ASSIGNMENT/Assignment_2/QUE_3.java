/*Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle 
  and displays its area. The formula for computing the area of a triangle is s = (side1 + side2 + side3)/2; 
  area=√𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐)                                                         */
import java.util.Scanner;
public class QUE_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the six points of triangle :");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double side1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double side2 = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double side3 = Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("The area of the triangle is "+area);
		sc.close();
	}

}
