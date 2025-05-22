/*Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.
*/
import java.util.*;
 class Product{
 	int pid;double price;
 	static double tot_price;
 	Product(int pid,double price){
 	    this.pid = pid;
 	    this.price = price;
 	    }
 	 void display() 
 	   {
 	    System.out.print("Product id:"+pid);
 	    System.out.print(" ,Price:"+price);
 	    System.out.println();
 	    tot_price+=price;
 	   }
 }
 	public class Q4 {
 	   public static void main(String[] args) {
 	    Scanner sc=new Scanner(System.in);
 	    Product pr[]=new Product[5];
 	 	 for (int i=0;i<pr.length;i++) 
 	    {
 	       System.out.print("Enter product id:");
 	       int pid=sc.nextInt();
 	       System.out.print("Enter price:");
 	       double price=sc.nextDouble();
 	       pr[i]=new Product(pid,price);
 	       pr[i].display();
 	    }
 	    System.out.println("Total price is  "+Product.tot_price+" rupees only...");
 	   }
 	}
 	        