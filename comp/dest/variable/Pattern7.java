package comp.dest.variable;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n = sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i/2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
				System.out.println();
			
		}
	}
}
