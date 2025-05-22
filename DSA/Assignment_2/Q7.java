/*
Define a base class Person with instance variable name, age. The instance variables are
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
to display the information of employee details.*/
import java.util.Scanner;
class Person
{
    String name;int age;
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person 
{
    int Eid;double salary;
    public Employee(String name, int age, int Eid, double salary)
    {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary; 
    }

    public void empDisplay() 
    {
        System.out.println(  name+"\t"+ age+"\t"+Eid+"\t"+salary);
    }
}
public class Q7
 {
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter name:");
    	String name=sc.nextLine();
    	System.out.print("Enter age: ");
    	int age=sc.nextInt();
    	System.out.print("Enter employee id: ");
    	int Eid=sc.nextInt();
    	System.out.print("Enter salary: ");
    	double salary=sc.nextDouble();
        Employee emp = new Employee(name,age,Eid,salary);
        System.out.println("Emp_Name\t" +"Age:\t" +"Emp_ID \t"+"Salary\t");
        emp.empDisplay();
    }
 }

