public class q1{
     public  static int linearSearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
      public static void main(String[] args)  {
        int[] arr = { 15,87,34,5,67,10 };
        int n = arr.length;       
        int x = 5;
 
        int index = linearSearch(arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index+" in the array.");
    }
}

/*                          OTHERWISE....................
import java.util.*;
public class q1_linearSearch_iterative {
    public static void main(String[] args)  {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        boolean found=false;
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        for (int i = 0; i < n; i++)
            if(arr[i]== key)
            {
                found=true;
                break;
            }
        System.out.println("linear search Element present in the array : "+found);
    }
}*/