public class question5
{
public static void main(String [] args)
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int sum = a+b+c;
int max = Math.max(a,b);
int max1 = Math.max(max,c);

int min = Math.min(a,b);
int min1 = Math.min(min,c);

int middle = sum-max1-min1;
System.out.println("max= "+max1+"middle= "+middle+"min= "+min1);
}
}