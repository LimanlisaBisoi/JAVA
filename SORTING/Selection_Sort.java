public class q3 {
	    public static void main(String[] args) {
	        int[] arr = {105,623,1742,91,74};
	        selectionSort(arr);
	        System.out.println("Sorted array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    public static void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }
}

