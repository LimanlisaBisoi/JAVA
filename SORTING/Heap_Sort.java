public class Heap_Sort {

    // Main function to sort an array using Heap Sort
    public void sort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap from the input array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[], n is the size of heap
    void heapify(int[] arr, int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Utility function to print the array
    public void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        Heap_Sort hs = new Heap_Sort();
        System.out.println("Original array:");
        hs.printArray(arr);

        hs.sort(arr);

        System.out.println("Sorted array:");
        hs.printArray(arr);
    }
}
