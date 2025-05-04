/*Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
overloading.                                                                       */
public class Q10 {

	public static void main(String[] args) {
		System.out.println("area of triangle is "+areaTriangle(5,10));
		System.out.println("area of square is "+areaSquare(5));
		System.out.println("area of circle is "+areaCircle(10));
		System.out.println("area of rectangle is "+areaRect(5,10));
	}
	public static double areaTriangle (double b,double h) {
		return (0.5*b*h);
	}

	public static double areaSquare (double s) {
		return (s*s);
	}
	
	public static double areaCircle (double r) {
		return (Math.PI*r*r);
	}
	public static double areaRect (double p,double b) {
		return (p*b);
	}
}
