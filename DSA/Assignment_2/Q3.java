/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable
and to display the value of instance variable. Write a program to create the details of 5 students.
Display the information of the students who has secured the highest DSA_Mark.
*/
import java.util.*;
class Student{
	int roll;double DSA_Mark;String name;
	void getdata() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name:");
	String name=sc.nextLine();
	System.out.print("Enter roll no.:");
	int roll=sc.nextInt();
	System.out.print("Enter DSA_Mark:");
	double DSA_Mark=sc.nextDouble();
	}
    void showdata(){
        System.out.print("Name:"+name+"\t");
        System.out.print("Roll no.:"+roll+"\t");
        System.out.print("DSA_Mark:"+DSA_Mark+"\t");
        System.out.println();
    }   
}
public class Q3{
    public static void main(String[] args) {
        Student a[] = new Student[5];
        for (int i = 0; i < 5; i++) {
        a[i]=new Student();
        System.out.println("Enter details of student " + (i + 1) + ":");
        a[i].getdata();
     }
        double maxMark =0;
        int maxIndex = 0;
        for (int i = 0; i < a.length;i++) {
        if (a[i].DSA_Mark > maxMark) 
            {
                maxMark = a[i].DSA_Mark;
                maxIndex = i;
            } 
        }
        System.out.println("Details of student with highest DSA Mark: ");
        a[maxIndex].showdata();
    }
}
