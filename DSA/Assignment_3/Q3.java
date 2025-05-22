/*Create a class Student having two instance variable name and mark. Enter mark,
  name of the student. If mark is more than 100, create exception 
  MarksOutOfBoundsException & throw it using Java. Display the customised message
   Marks can’t be greater than 100 for the exception. */
import java.util.*;

  class MarksOutOfBoundsException extends Exception {
	      MarksOutOfBoundsException(String message)
		   {
		        super(message);
		   }
		}
 // class Student {
	//	String name; double mark;
	//	Student(String name, double mark) {
	//		this.name = name;
	//		this.mark = mark;
	//	}
	//}
    public class Q3 {
	     public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     System.out.print("Enter your name: ");
		     String name =sc.nextLine();
		     System.out.print("Enter your marks: ");
		     double mark=sc.nextInt();
	//	     Student s = new Student(name, mark);
		     try{
		         if(mark>100)
		          throw new MarksOutOfBoundsException("Marks can't be greater than 100");
		            
		         System.out.println(name+" has got "+mark);
		        }
		        catch(MarksOutOfBoundsException ob)
		        {
		            System.out.println(ob);
		        }
		    }
		}
