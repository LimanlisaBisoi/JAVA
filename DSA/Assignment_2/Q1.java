/*
 A phone number can be thought of as having three parts: the area code, the exchange code and
the number.
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts:
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ). Display
both the numbers.*/
public class Q1 {
	public static void main(String[] args) {
        Phone ph1 = new Phone();
        ph1.area_code=212;
        ph1.exchange=767;
        ph1.number=8900;
        
        Phone ph2 = new Phone();
        ph2.input(415,555,1212);
        
        System.out.print("My number is ");
        ph1.display();
        
        System.out.print("\nYour number is ");
        ph2.display();
	}
}
		class Phone 
		{
		    int area_code, exchange, number;

		    void input(int a,int e,int n) 
		    {
		        area_code =a;
		        exchange = e;
		        number =n;
		    }
		    
		    void display(){
		        System.out.printf("("+area_code+") "+exchange+"-"+ number);
		    }
		}
