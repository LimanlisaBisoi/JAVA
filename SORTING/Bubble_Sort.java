public class q1 {
	    public static void main(String[] args) {
	        int[] arr = {25,89,567,417,10,75};
	        bubbleSort(arr);
	        System.out.println("Sorted array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	   public static void bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
}