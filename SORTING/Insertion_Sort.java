public class q2{
	    public static void main(String[] args) {
	        int[] a = {95,103,82,10,374};
	        insertionSort(a);

	        System.out.println("Sorted array:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }

	    public static void insertionSort(int[] a) {
	        for (int i = 1; i < a.length; i++) {
	            int currentElement = a[i];
	            int j = i - 1;
	            while (j >= 0 && a[j] > currentElement) {
	                a[j + 1] = a[j];
	                j--;
	            }
	            a[j + 1] = currentElement;
	        }
	    }
	}
