public class q2 {
    public static int linearsearch(int arr[], int size, int key)  {
        if (size == 0) {
            return -1;
        }
        else if (arr[size - 1] == key) {
            return size - 1;
        }
        return linearsearch(arr, size - 1, key);
    }

    public static void main(String[] args)  {
        int arr[] = {15,67,89,107,7,125};
        int key = 7;
        int index = linearsearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("The element is found at "+index+" index of the given array.");

        else
            System.out.println("The element is not found in the array.");
    }
}


/*                    OTHERWISE........................
import java.util.*;
public class q2  {
    public static void main(String[] args)  {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        System.out.println("linear search recursive Element present in the array : "+Search(arr,key,0));
    }
    public static boolean Search(int[] a,int x,int i) {
        if (i==a.length)
            return false;
        if(a[i]==x)
            return true;                
        return Search(a,x,i+1);
    }
    
}*/
