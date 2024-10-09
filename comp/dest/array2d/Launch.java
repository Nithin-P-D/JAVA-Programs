package comp.dest.array2d;

import java.util.Scanner;

class LinearSearch{
	int arr[];
	int flag=0;
	int size;
	
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is ready");
	}
	void addElement() {
		System.out.println("Adding elements to the array");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements added to the array");
	}
	void linearSearch() {
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		for(int i= 0;i<size;i++) {
			if(arr[i]==ele) {
				System.out.println("element present in the postion: "+(i));
				flag++;
			}
		
			
		}
	
	
	if(flag<=0) {
		System.out.println("Element not found");
	}
	
}
}

public class Launch {
public static void main(String[] args) {
	LinearSearch lc = new LinearSearch();
	lc.createArray();
	lc.addElement();
	lc.linearSearch();
}
}
