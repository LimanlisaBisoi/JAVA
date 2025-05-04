public class Q1
{
public static void main(String args[])
{
int principle=Integer.parseInt(args[0]);
int rate = Integer.parseInt(args[1]);
int time=Integer.parseInt(args[2]);
System.out.println("Principle,Rate,Time : "+principle + "," + rate + ","+time);
int SI =( (principle*rate*time)/100);
System.out.println("The Simple Interest is "+SI);
}
}