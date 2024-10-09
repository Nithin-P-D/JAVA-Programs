package comp.dest.array;

import java.util.Scanner;

class BubbleSortAlgo{
	int arr[];
	int size;
	Scanner sc =  new Scanner(System.in);
	public void createArray() {
		System.out.println("Enter the array size: ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is created");
		System.out.println("========================");
		
	}
	public void collectData() {
		System.out.println("Collecting the array data: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();	
		}
		System.out.println("Array is created");
		
		System.out.println("============================");
		
	}
	public void dispaly() {
		System.out.println("The elements inside the array are: ");
		for(int i = 0 ; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void sort() {
		System.out.println("Sorting is initiated");
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=(i+1);j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
	}
}
public class BubbleSort {
public static void main(String[] args) {
	BubbleSortAlgo bs = new BubbleSortAlgo();
	bs.createArray();
	bs.collectData();
	bs.sort();
	bs.dispaly();
}
}
