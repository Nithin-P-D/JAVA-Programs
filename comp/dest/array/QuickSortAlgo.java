package comp.dest.array;

import java.util.Scanner;
class QuickSort{

	public void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
		
	}
	private int partition(int[] arr, int start , int end) {
		int pivot = arr[end];
		int i = start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(arr[j]< pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		 arr[end] = temp;
		 
		 return(i+1);
		
	}
	
}
class ArrayOps{
	int arr[];
	int size=0;
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter the Array size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is created");
		System.out.println("========================");
	}
	 void collectArrayData() {
		System.out.println("Collecting the array data: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();	
		}
		System.out.println("Array data is collected");
		
		System.out.println("============================");
		
	}
	 void dispaly() {
		System.out.println("The elements inside the array are: ");
		for(int i = 0 ; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("===============================");
	}
	 void sorting() {
		 QuickSort qs = new QuickSort();
		 qs.quickSort(arr,0,size-1);
	 }
	
}
public class QuickSortAlgo {
public static void main(String[] args) {
	ArrayOps ao = new ArrayOps();
	ao.createArray();
	ao.collectArrayData();
	System.out.println("before srting");
	ao.dispaly();
	ao.sorting();
	System.out.println("after sorting");
	ao.dispaly();
}
}
