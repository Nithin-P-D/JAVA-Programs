package comp.dest.variable;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n: ");
		
		int n = sc.nextInt();
		int count = n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(count<10) {
					System.out.print("0"+count+" ");
				}
				else {
					System.out.print(count+ "  ");
				count--;
				}
				}
			System.out.println();
		}
	}
}
