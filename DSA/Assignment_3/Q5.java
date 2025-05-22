/*Write a java method using Generics to count the occurrence of an element in an
  array of any type. The signature of count method is given below.
         public static <T> int count(T[] array, T item)  */
import java.util.*;
public class Q5 {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Integer a [] = new Integer[5];
        System.out.println("Enter integer array elements: ");
        for(int i = 0;i<a.length;i++)
             a[i] = sc.nextInt();
        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();
        int c = count(a, n);
        System.out.println("Number of times "+ n +" present in the array is "+c);
    }
    public static <T> int count(T[] array,T item)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
            if (array[i].equals(item)) // equals() method instead of array[i]==k because 
                                       // incase it will String type then it will show error
                count++;
        return count;
    }
}
/*                  OTHERWISE.......
public class q {
static <T> void printArray(T[] array,T item) {
	for(T element:array){
	if (element.equals(item)
	    count++;
	    }
		System.out.print(count);
}
public static void main(String[] args)
{
	Integer a[]= {1,3,2,26,2};
	Double d[]= {4.5,4.75,7.57};
	printArray(a,2);
	System.out.println();
	printArray(d,4.75);
   }
}                                                           */
