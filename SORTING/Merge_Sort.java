
public class Merge_Sort {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,1,4,5,7,6};
		System.out.print("Original Array: ");
		printArray(arr);
		mergeSort(arr);
		System.out.print("\nSorted Array: ");
		printArray(arr);
	}
	public static void mergeSort(int[]arr) {
		if(arr.length<=1) {
			return;
		}
		
		int mid=arr.length/2;
		int[] left=new int[mid];
		int[] right=new int[arr.length - mid];
		System.arraycopy(arr, 0, left,0, mid);
		System.arraycopy(arr, mid, right,0,arr.length-mid);
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);
	}
	public static void merge(int[]arr,int[]left,int[]right) {
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
	}
	}
	public static void printArray(int[]arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}

