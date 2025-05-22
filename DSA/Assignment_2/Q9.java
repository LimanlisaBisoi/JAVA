/*Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/
import java.util.*;
class Students{
	int roll;String name,course;
   void	input_Student(){
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Course name:");
		course=sc.nextLine();
		System.out.print("Enter the name:");
		name=sc.nextLine();
		System.out.print("Enter roll no.:");
		roll=sc.nextInt();
		}
   void display_Student(){
	    System.out.print(course+"\t\t" + name+"\t\t" +roll+"\t\t");
	}
}
class Exam extends Students{
	double mark1,mark2,mark3;
   void input_Marks() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the marks:");
	mark1=sc.nextDouble();
	mark2=sc.nextDouble();
	mark3=sc.nextDouble();
	}
   void display_Result(){
    	System.out.print(mark1+" , "+mark2+", "+mark3);
        System.out.println();
   }
}
public class Q9 {
	public static void main(String[] args) {
        Exam a[] = new Exam[5];
        for (int i = 0; i < a.length; i++) {
        	a[i]=new Exam();
        	a[i].input_Student();
        	a[i].input_Marks();
        }
        System.out.println("Course_Name\t" +"Student_Name\t" +"Roll_no.\t"+"Marks\t");
        for(int i=0;i<a.length;i++) {
        	a[i].display_Student();
            a[i].display_Result();
        }
	}
}