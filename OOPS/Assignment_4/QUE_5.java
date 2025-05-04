/*Write a Java program to check if a number is perfect number or not. 
(Hints: A number N is called perfect number, if the sum of factors except N as a factor is 
equals to the number N. 
Example: N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)                                    */
import java.util.*;
public class QUE_5 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int count = 0;
for (int i=1;i<=num/2;i++)
{
     if (num % i==0)
          count+=i;
}
if (count==num)
{
    System.out.println("It is a perfect number.");
}else{
      System.out.println("It is not a perfect number.");
     }
   }
}