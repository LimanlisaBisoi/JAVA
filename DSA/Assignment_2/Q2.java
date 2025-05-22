/*
Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:
public Complex add(Complex, Complex)
System.out.printf("%.2f %s %.2f%s\n",real,(imag <0?" - ":" + ") ,Math.abs(imag),"i");
*/
import java.util.*;
 class Complex
	{
	    int real,imag;    
	    void setData (int r,int i) 
	    {
	        real = r; imag= i;
	    }
	    
	    void display() 
	    {
	        System.out.println(real+"+i"+imag);
	    }
	    
	  public Complex add(Complex c1, Complex c2) {
	        Complex result = new Complex();
	        result.real = c1.real + c2.real;
	        result.imag = c1.imag + c2.imag;
	        return result;
	    }     
	}
	public class Q2 
	{
	    public static void main(String[] args)  {
	      Scanner sc=new Scanner(System.in);
          int r,i;
		  Complex c1=new Complex();
		  System.out.print("Enter real & imaginary part of 1st number separated by space :");
		  r = sc.nextInt();
	      i =sc.nextInt();
		  c1.setData(r,i);
		  Complex c2=new Complex();
		  System.out.print("Enter real & imaginary part of 2nd number separated by space :");
		  r = sc.nextInt();
	      i =sc.nextInt();
		  c2.setData(r,i);
		  Complex sum=new Complex();
		  sum=sum.add(c1,c2);
		  System.out.print("The sum is : ");
		  sum.display();
		 	    }
	}

