 /*  Enter the basic salary of an employee of an organization through the keyboard. His dearness
		  allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
		  salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross salary. */
//Answer:-
import java.util.Scanner;
public class QUE_3 {

	public static void main(String[] args)
	{
		double a,b,c,d;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the basic Salary:");
		a = ob.nextFloat();
		b = a*0.4;
		c = a*0.2;
		d = a+c+b;
		System.out.println("DA = "+b);
		System.out.println("HRA = "+c);
		System.out.println("Gross Salary = "+d);
	}

}
