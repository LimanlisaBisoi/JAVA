/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the 
number and its reverse both are prime then it is called twisted prime. */
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int num=n,reverse=0;
	while(n!=0) {
		int digit = n%10;
		reverse = reverse*10+digit;
		n/=10;
	}
	int flag1=0;
	for(int i =1;i<=num;i++) {
		if(num%i==0)
			flag1++;
	}
	int flag2=0;
	for(int j =1;j<=num;j++) {
		if(num%j==0)
			flag2++;
	}
	if(flag1==2 && flag2==2)
		System.out.println(num+" is a twisted prime number.");
	else System.out.println(num+" is not a twisted prime number.");
	
	}
}
