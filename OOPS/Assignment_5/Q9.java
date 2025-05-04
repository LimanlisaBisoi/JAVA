import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	double sum=0;
	for(double i=1;i<=n;i++) {
		double ans=1/(i*i);
		sum+=ans;
	}
	System.out.println("sum= "+sum);
	}

}
