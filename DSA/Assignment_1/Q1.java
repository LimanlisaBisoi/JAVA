//Write a Java program that can take a positive integer greater than 2 as input and write out the
//number of times one must repeatedly divide this number by 2 before getting a value less
//than 2.
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		System.out.print("Enter positive integer greater than 2 : ");
		int a = sc.nextInt();
		int count=0;
		while(a>2)
		{
			count++;
			a=a/2;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is :"
						 +count);
		

	}

}
