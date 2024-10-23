

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num-1:");
			int num1 = sc.nextInt();//critical statement
			System.out.println("Enter the num-2:");
			int num2 = sc.nextInt();//critical statement
			int res = num1/num2;//critical statement
			System.out.println(res);
			System.out.println("Division opertion is completed");
			
			System.out.println("Array operation is started");
			System.out.println("Enter the array size");
			int n = sc.nextInt();//critical statement
			int arr[] = new int[n];//critical statement
			
			System.out.println("Enter the postion to insert the value");
			int pos = sc.nextInt();//critical statement
			System.out.println("Enter the value: ");
			int val = sc.nextInt();//critical statement
			
			arr[pos]= val;//critical statement
			
			System.out.println("Data added");
			System.out.println("Array operation is completed");
		}
		//specific catch
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception is handled");
			
		}

		catch(NegativeArraySizeException ae) {
			System.out.println("Arithmetic Exception is handled");
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Arithmetic Exception is handled");
			
		}
		catch(InputMismatchException ae) {
			System.out.println("Arithmetic Exception is handled");
			
		}
		
		catch(Exception e) {//generic catch block
			System.out.println("Exceptiin occured inmain is handled");
		}
	}
}
