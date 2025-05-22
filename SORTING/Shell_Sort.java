public class Shell_Sort {

    // Function to perform Shell Sort
    public void sort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Put temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
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
        int[] arr = {12, 34, 54, 2, 3};
        Shell_Sort shellSort = new Shell_Sort();
        System.out.println("Original array:");
        shellSort.printArray(arr);

        shellSort.sort(arr);

        System.out.println("Sorted array:");
        shellSort.printArray(arr);
    }
}
