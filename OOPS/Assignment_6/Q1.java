/*Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root.    */
import java.util.*;
public class Q1 {

	public static int additionSimple(int x,int y) {
		return x+y;
	}
	public static int substractionSimple(int x,int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x,int y) {
		return x*y;
	}
	public static double divisionSimple( int x,int y) {
		double div =0;
		if(x!=0)
			div=y/x;
		return div;
	}
	public static int remainderSimple(int n,int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		return Math.sqrt(n);
	}
     public static void main(String[]args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter first number: ");
    	 int a=sc.nextInt();
    	 System.out.println("Enter second number: ");
    	 int b=sc.nextInt();
    	 System.out.println("Enter an operator(for square root,enter 'r'):");
    	 sc.nextLine();
    	 char ch = sc.nextLine().charAt(0);
    	 switch (ch) {
    	 case '+': System.out.println(a+"+"+b+"="+additionSimple(a,b));break;
    	 case '-': System.out.println(b+"-"+a+"="+substractionSimple(a,b));break;
    	 case '*': System.out.println(a+"*"+b+"="+multiplicationSimple(a,b));break;
    	 case '/': if(a==0)
    		          System.out.println("invalid");
    	           else System.out.println(b+"/"+a+"="+divisionSimple(a,b));break;
    	 case '%':if((a==0)||(b==0))
    	                  System.out.println("invalid");
    	             else System.out.println(b+"%"+a+"="+remainderSimple(a,b));break;
    	 case 'r': if(a>=0) 
    		       System.out.println("squareRoot of "+a+"="+squareRootSimple(a));
    		       else System.out.println("invalid");break;
    	 default:  System.out.println("invalid");
   
    
     }
	
	}
}
	


