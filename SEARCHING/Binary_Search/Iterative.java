public class q3 {
    public static void main(String[] args) {
        int[] arr = {8,19,51,65,77,81,89,273};
        int key = 273;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index + ".");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

/*                        OTHERWISE.....................................
import java.util.*;
public class q3{
 public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        boolean found=false;
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        int s=0,e=n-1;
        while(s<= e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==key)
            {
                found=true;
                break;
            }
            if(arr[mid]<key)
                s=mid+1;
            if(arr[mid]>key)
                e=mid-1;
        }
        System.out.println(" binary search Element present in the array : "+found);
    }
}    */