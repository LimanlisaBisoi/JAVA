/* Write a program to input 3 integer number a, b, c. Find the largest number among 3. 
Also find the 2nd largest number among 3.                               */
import java.util.*;
public class QUE_9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three integers: ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	int max = Math.max(Math.max(x, y)z);
	int min = Math.min(Math.min(x, y)z);
	int mid = x+y+z-max-min;
	System.out.println("Largest number: "+max);
	System.out.println("Second largest number: "+mid);

	}
}
