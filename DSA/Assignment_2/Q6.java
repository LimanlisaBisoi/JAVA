/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.
*/
import java.util.*;
abstract class Shape 
{
    abstract double getArea();
}
class Square extends Shape 
{
    double side;    
    Square(double s) 
    {
        side = s;
    }    
    double getArea() 
    {
        return side * side;
    }
}
class Triangle extends Shape 
{
    double base,height;    
    Triangle(double b, double h) 
    {
        base = b;
        height = h;
    }    
    double getArea()
    {
        return 0.5 * base * height;
    }
}
class Circle extends Shape 
{
    double radius;    
    Circle(double r) 
    {
        radius = r;
    }    
    double getArea() 
    {
        return Math.PI * radius * radius;
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {     
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter side of the square: "); 
        double side=sc.nextDouble();
        Square s=new Square(side);
        System.out.print("Enter base & height of the triangle: "); 
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        Triangle t=new Triangle(base,height);
        System.out.print("Enter radius of the circle: "); 
        double radius=sc.nextDouble();
        Circle c=new Circle(radius);
        System.out.println();
        System.out.println("Area of square is : " + s.getArea());
        System.out.println("Area of triangle is : " + t.getArea());
        System.out.println("Area of circle is : " + c.getArea());
    }
}

