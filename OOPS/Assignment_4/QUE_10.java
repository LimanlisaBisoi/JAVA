//Write a java program to print largest power of three less than or equal to N.

import java.util.*;
public class QUE_10
{
   public static void main (String [] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
int p = 3;
while (p <= num/3)
{
p = p*3;
}
System.out.println("The largest power of 3 less than or equal to "+num+" is "+p);
   }
}
/*                             OTHERWISE...................
Scanner sc = new Scanner (System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
int largestPower = 1;
while (largestPower <= num)
{
   largestPower *= 3;
}
largestPower/=3;
System.out.println("The largest power of 3 less than or equal to "+num+" is "+largestPower);
*/