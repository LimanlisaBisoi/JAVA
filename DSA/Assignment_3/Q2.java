/*Assign your favorite colors in an array. Identify 2 exceptions that may be 
  generated & write exceptional handler in Java. Also, display the four colors
  after handling any 2 exceptions. */
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter four colours:");
		 String colours []= new String[4];
		     for (int i = 0; i < colours.length; i++) 
		       {
		         colours[i] = sc.nextLine();
		       }
		       try 
		        {
		          Integer.parseInt(colours[0]);//converting string to integer
		        } 
		       catch(NumberFormatException e)
		        {
		            System.out.println(e);
		        }
		       try{
		        System.out.println("Enter one more colour: ");
		        colours[5]=sc.nextLine();
		        }
		       catch (ArrayIndexOutOfBoundsException e) {
		             System.out.println(e);
		         }
		       finally {
		       System.out.println("The colours entered are :");
		       for(int i=0;i<colours.length;i++)
		        System.out.println(colours[i]);
		       } 
		   }
	}
