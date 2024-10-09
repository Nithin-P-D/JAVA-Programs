package comp.dest.array2d;

import java.util.Scanner;

public class Array3DMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Array3DOps ao = new Array3DOps();
	System.out.println("Enter the school count: ");
	int sch = sc.nextInt();
	System.out.println("Enter the class count: ");
	int cls = sc.nextInt();
	System.out.println("Enter the student count in each class: ");
	int stu = sc.nextInt();
	ao.createArray(sch,cls,stu);
	ao.insertData(sch,cls,stu);
	ao.dispaly(sch,cls,stu);
}
}
