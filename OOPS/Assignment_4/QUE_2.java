/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your 
program to determine whether or not the number is divisible by 9. Test it on the following 
numbers: Use while loop.
n = 123456
n = 154368
n = 621594                                                                                */
import java.util.Scanner;
public class QUE_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		while (n>0){
		int digit=n%10;
		sum+=digit;
		n/=10;
		}
		if (sum%9==0){
		System.out.println("The number is divisible by 9");
		}else{
		System.out.println("The number is not divisible by 9");
		}
	}
}