/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable Datatype
Principal Long
Time Integer
rate Double
Total_amt Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are
overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the
value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;*/
import java.util.*;
class Deposit {
    long Principal;int Time;double rate; double Total_amt;
    Deposit(){ }
    Deposit(long Principal, int Time, double rate) 
    {
        this.Principal = Principal;
        this.Time = Time;
        this.rate = rate;
    }    
    Deposit(long Principal, int Time) 
    {
        this.Principal = Principal;
        this.Time = Time;
    }    
    Deposit(long Principal, double rate) 
    {
        this.Principal = Principal;
        this.rate =rate;
    }
    void display() 
    {
    	System.out.print("Principal: "+Principal+" ");
  	    System.out.print("Time: "+Time+" ");
  	    System.out.print("Rate: "+rate+" ");
	    System.out.print("Total amount: "+Total_amt+" ");
	    System.out.println();
    }
    void calc_amt()
    {
        Total_amt = Principal + ((Principal * rate * Time) / 100.0);
    }
}
public class Q5 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Principal: ");
    	long Principal=sc.nextLong();
  	    System.out.print("Enter rate: ");
  	    double rate=sc.nextDouble();
	    System.out.print("Enter time: ");
	    int Time=sc.nextInt();
	    System.out.println();
	    Deposit d1=new Deposit();
	    d1.calc_amt();
        d1.display();
        Deposit d2=new Deposit(Principal, Time, rate);
	    d2.calc_amt();
        d2.display();
        Deposit d3=new Deposit(Principal, Time);
	    d3.calc_amt();
        d3.display();
        Deposit d4=new Deposit(Principal, rate);
	    d4.calc_amt();
        d4.display();
    }
}
       