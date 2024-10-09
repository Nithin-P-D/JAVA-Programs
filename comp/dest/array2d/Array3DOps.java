package comp.dest.array2d;

import java.util.Scanner;

public class Array3DOps {
	public static String arr[][][];
	public Scanner sc = new Scanner(System.in);

	public void createArray(int sch, int cls, int stu) {
		arr = new String[sch][cls][stu];
		
	}

	public void insertData(int sch, int cls, int stu) {
		System.out.println("Collecting student age: ");
		for(int i=0;i<sch;i++) {
			System.out.println("Inside the school number: "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class number "+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the age of the student number: "+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data is loaded on to the array");
		System.out.println("--------------");
		
	}

	public void dispaly(int sch, int cls, int stu) {
		System.out.println("Displaying student age: ");
		for(int i=0;i<sch;i++) {
			System.out.println("Inside the school number: "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class number "+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("The age of the student number: "+(k+1)+"is="+arr[i][j][k]);
					 
				}
			}
		}
		
		System.out.println("--------------");
		
	}

}
