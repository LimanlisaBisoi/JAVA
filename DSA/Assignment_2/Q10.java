/*Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.*/
//Create a 2 package q10pack1 and q10pack2
//create a q10.java in q10pack1 and sport.java file under q10pack2....
//The first part in q10.java under q10pack1
import java.util.Scanner;

import q10pack1.*;
import q10pack2.*;

public class Q10 implements Sports{

	public static void main(String[] args) {
		Test ob = new Test();
		ob.input();
		System.out.println("Enter score1 and score 2: ");
		int t = ob.mark1 + ob.mark2 + score1 + score2;
		System.out.println("Grand Total = " + t);
	}
}

/*                    OTHERWISE.........
 import java.util.*;
class Student {
String name;int roll;
 public void input() 
   {
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter student name : ");
       name = obj.nextLine();
       System.out.print("Enter roll no : ");
       roll = obj.nextInt();
   }
   public void output() 
   {
       System.out.print("Student Name is " + name+" having roll no " + roll);
   }
}
class Test extends Student {
   int mark1;
   int mark2;
   public void input() 
   {
       super.input();
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter mark1: ");
       mark1 = obj.nextInt();
       System.out.print("Enter mark2: ");
       mark2 = obj.nextInt();
   }
   public void output() 
   {
       super.output();
       System.out.print(" secured Mark 1: " + mark1+" & Mark 2 "+ mark2);
   }
} 
public class q10 {
	    public static void main(String[] args) {
	        GrandTotal g1=new GrandTotal();
	        g1.input();
	        g1.output();
	    }
	}                                                                          */