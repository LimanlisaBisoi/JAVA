public class question7
{
public static void main(String[]args)
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
boolean res=((a+b)>=c)||((b+c)>=a)||((a+c)>=b);
System.out.println(res);
}
}