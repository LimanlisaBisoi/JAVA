/*Write a java program to exchange the values of two variables of integer type X and Y using third temporary 
  variable Z   */
public class QUE_7 {

	public static void main(String[] args)
	{
		int X = 20;
		int Y = 30;
		System.out.println("Before swapping");
		System.out.println("value of X = " + X);
		System.out.println("value of Y = " + Y);
		int Z = X;
		    X = Y;
		    Y = Z;
		System.out.println("After swapping");
		System.out.println("value of X " + X);
		System.out.println("value of Y " + Y);

	}

}
