// Write a java program that displays the following table. Cast floating-point numbers into integers.
	//a b pow(a, b)
	//1 2 1
	//2 3 8
	//3 4 81
	//4 5 1024
	//5 6 15625
//Answer:-		
public class QUE_7 {

	public static void main(String[] args) 
	{
		float a = 1,b = 2;
		System.out.println("a b pow(a,b)");
		System.out.println((int)a+" "+(int)b+" "+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+" "+(int)b+" "+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+" "+(int)b+" "+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+" "+(int)b+" "+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a+" "+(int)b+" "+(int)Math.pow(a, b));
		
	}
}
