/*WAP to enter the value of n and display find the following sum of the series:
1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)                         */
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=n;i>=1;i--) {
		for(int j=i;j>=1;j--) {
		sum+=j;
	}
	}
       System.out.println("Sum="+sum);
	}

}
