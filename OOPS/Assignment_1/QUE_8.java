/*Write a java program to exchange the values of two variables of integer type X and Y without using third 
  temporary variable. */
public class QUE_8 {

	public static void main(String[] args)
	{
	  System.out.println("Before swapping");
	  int X = 10;
	  int Y = 20;
	  System.out.println("value of X =" + X);
	  System.out.println("value of Y =" + Y);
	  System.out.println("After swapping");
	  X = X+Y;
	  Y = X-Y;
	  X = X-Y;
      System.out.println("Final value");
      System.out.println("value of X =" + X);
      System.out.println("value of Y =" + Y);


	}

}
