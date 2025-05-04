public class Q3
{
public static void main(String [] args)
{
int num=Integer.parseInt(args[0]);
System.out.println("The number is "+num);
int lastdigit = num%10;
int firstdigit = num/1000;
int sum = firstdigit+lastdigit;
System.out.println("The Sum of The last digit and first digit of the number is "+sum); 
}
}