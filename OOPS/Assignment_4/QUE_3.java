/*Write a java program that takes an integer N from user, uses Math. Random () to print N random
  integer numbers between 1 to N, and then prints their average value. Use do while loop.                */
import java.util.*;
public class QUE_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =sc.nextInt();
		int sum=0,count=num;
		System.out.println("Random numbers generated are :");
		do{
		int r =(int) (1+(num+1-1)*Math.random());
		System.out.println(r+" ");
		sum=sum+r;
		count--;
		}
		while(count>0);
		int a=sum/num;
		System.out.println("Average of "+num+" random numbers is "+a);

	}
}
/*                                    OTHERWISE...........
int num,r,count=0;
System.out.println("Enter a number :");
int num =sc.nextInt();
int sum=0;
System.out.println("Random numbers generated are :");
do{
int r =1+((int)((Math.random())*((num-1)+1)));
count=count+r;
System.out.println(r+" ");
sum++;
}
while(sum<=num-1);
int average=count/num;
System.out.println("Average of "+num+" random numbers is "+a);
*/
