import java.util.Arrays;

public class Quick_Sort {
	public static int partition(int arr[],int p,int q) {
		int x=arr[p];
		int i=p;
		for(int j=p+1;j<=q;j++) {
			if(arr[j]<=x) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp2=arr[i];
		arr[i]=arr[p];
		arr[p]=temp2;
		return(i);
	}
	
	public static void QuickSort(int arr[],int p,int q) {
		if(p<q) {
			int m=partition(arr,p,q);
			QuickSort(arr,p,m-1);
			QuickSort(arr,m+1,q);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {3,5,6,9,2,1,90};
		System.out.println("Array Before Sorting: "+Arrays.toString(arr));
		QuickSort(arr,0,arr.length-1);
		System.out.println("Array After Sorting: "+Arrays.toString(arr));
	}

}
