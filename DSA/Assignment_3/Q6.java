/*Write a simple main class in Java that contains an experiment that uses the 
 generic Box<T> class to build boxes with different types and that verifies 
 that this class works as advertised. Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change 
  the contents of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change
  the contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine
  what happens if you put a string in the box. Determine what happens if you put
  an integer in the box. */
public class Q6 {
	 public static void main(String[] args) 
	    {
	      Box<String> strobj1 = new Box<>("It is the object of Box String");
	      Box<String> strobj2 = strobj1;
	      System.out.println("String variable_1 contains: " + strobj1.get());
	      System.out.println("String variable_2 contains: " + strobj2.get());
	      strobj1.set("Changed");
	      System.out.println("String box1 contains: " + strobj1.get());
	      System.out.println("String box2 contains: " + strobj2.get());

	      Box<Integer> intBox1 = new Box<>(100);
	      Box<Integer> intBox2 = intBox1;
	      System.out.println("Integer box1 contains: " + intBox1.get());
	      System.out.println("Integer box2 contains: " + intBox2.get());
	      intBox1.set(20);
	      System.out.println("Integer box1 contains: " + intBox1.get());
	      System.out.println("Integer box2 contains: " + intBox2.get());

	      Box<Object> objectBox1 = new Box<>(new Object());
	      Box<Object> objectBox2 = objectBox1;
	      System.out.println("Object box1 contains: " + objectBox1.get());
	      System.out.println("Object box2 contains: " + objectBox2.get());
	      objectBox1.set("Hello");
	      System.out.println("Object box1 contains: " + objectBox1.get());
	      System.out.println("Object box2 contains: " + objectBox2.get());
	      objectBox1.set(10);
	      System.out.println("Object box1 contains: " + objectBox1.get());
	      System.out.println("Object box2 contains: " + objectBox2.get());
	    }
	}
class Box<T>
{
	    public T t;
	    public Box(T t) 
	    {
	        this.t = t;
	    }
	    public T get() 
	    {
	        return t;
	    }
	    public void set(T t) 
	    {
	        this.t = t;
	    }
	    
}

