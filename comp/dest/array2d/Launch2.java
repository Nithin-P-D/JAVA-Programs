package comp.dest.array2d;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch{
	int arr[];
	int flag=0;
	int size;
	
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		arr = new int[size];
		Arrays.sort(arr);
		System.out.println("Array is ready");
	}
	void addElement() {
		System.out.println("Adding elements to the array");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements added to the array");
	}
	void binarySearch() {
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		int first = 0;
		int last= size-1;
		while(first<=last) {
			int mid = (last+first)/2;
			if(arr[mid]==ele) {
				System.out.println("Element is found in the position no. : "+(mid+1));
				System.exit(0);
			}
			else if(arr[mid]<ele) {
				last=mid-1;
			}
			else if(arr[mid]>ele) {
				first=mid+1;			}
		}
	
}
}
public class Launch2 {
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.createArray();
		bs.addElement();
		bs.binarySearch();
	}
}
