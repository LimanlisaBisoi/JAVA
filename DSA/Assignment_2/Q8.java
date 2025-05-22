/*
Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display
name of a person, count the no. of characters present in the name of the person.*/
import java.util.*;
interface DetailInfo 
{
    void display();
    int count();
}
class Persons implements DetailInfo 
{
    static int maxcount = 15;
    String name;
    public Persons(String name)
      {
        this.name = name;
      }
    public void display() 
      {
        System.out.println("Name: " + name);
      }
    public int count() 
      {
        return name.length();
      }
}
class Q8 {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter name: ");
    	String name=sc.nextLine();
        Persons p = new Persons(name);
        p.display();
        int count=p.count();
        System.out.println("Name length: " + count);
    }
}

