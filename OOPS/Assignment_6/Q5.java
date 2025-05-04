/*A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
have the same degree (i.e., the polygon is both equilateral and equiangular). 
Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)                                          */
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of sides: ");
    int n = sc.nextInt();
    System.out.print("Enter the side of length: ");
    double side = sc.nextDouble();
    System.out.println("The area of polygon is "+area(n,side));
	}
	public static double area(int n,double side) {
		return(n*side*side/(4*Math.tan(Math.PI/n)));
	}
}
