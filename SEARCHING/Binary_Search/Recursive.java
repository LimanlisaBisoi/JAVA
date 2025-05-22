public class q4 {
    public static void main(String[] args) {
        int[] arr = {10,75,5,47,67,34};
        int key = 5;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index + ".");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearchHelper(arr, key, 0, arr.length - 1);
    }

    public static int binarySearchHelper(int[] arr, int key, int a, int b) {
        if (a > b) {
            return -1;
        }
        int mid = (a + b) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return binarySearchHelper(arr, key, mid + 1, b);
        } else {
            return binarySearchHelper(arr, key, a, mid - 1);
        }
    }
}

/*                     OTHERWISE.........................
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        System.out.println(" binary search recursive Element present in the array : "+Search(arr,key,0,n-1));
    }
    
    public static boolean Search(int[] a,int x,int l,int r) {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==x)
                return true;
            if (a[mid]>x)
                return Search(a,x,l,mid-1);
            if (a[mid]<x)
                return Search(a,x,mid+1,r);      
        
        }
        return false;
    }
}            */
