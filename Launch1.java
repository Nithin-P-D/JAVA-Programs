

import java.util.Scanner;

public class Launch1 {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1:");
		int num1 = sc.nextInt();//critical statement
		System.out.println("Enter the num-2:");
		int num2 = sc.nextInt();//critical statement
		int res = num1/num2;//critical statement
		
	}
	catch(Exception e) {//generic catch block
		System.out.println("Exceptiin occured inmain is handled");
	}
}
}
