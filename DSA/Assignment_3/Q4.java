/*Write a java program to print an array of different type using a single 
  Generic method. The signature of printArray method is given below.
     public static < E > void printArray( E[] inputArray)   */
import java.util.*;
public class Q4 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer array elements: ");
        Integer a []= new Integer[5];
        for (int i = 0; i < 5; i++) 
            a[i] = sc.nextInt();
        System.out.print("Integer Array contains: ");
        printArray(a);
        
        System.out.print("Enter array elements: ");
        Double d [] = new Double[5];
        for (int i = 0; i < 5; i++) 
             d[i] = sc.nextDouble();
        System.out.print("Double Array contains: ");
        printArray(d);        
    }
	
    public static <E> void printArray(E[] input) 
    {
        for (int i=0;i<input.length;i++) 
             System.out.print(input[i] + "  ");
        System.out.println();
    }
}

/*               OTHERWISE......
  public class q {
	static <E> void printArray(E[] inputArray) {
		for(E element:inputArray)
			System.out.print(element+" ");
	}
	public static void main(String[] args)
    {
		Integer a[]= {1,3,6,2};
		Double d[]= {4.5,4.75,7.57};
		printArray(a);
		System.out.println();
		printArray(d);
    }
}                                                                    */
