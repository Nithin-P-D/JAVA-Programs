package comp.dest.string;

import java.util.Scanner;

public class PanagramCode {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence ");
	String s1 = sc.nextLine();
	s1 = s1.toUpperCase();
    int arr[] = new int[26];
    for(int i=0;i<arr.length;i++) {
    	arr[i] = 0;
    }
    int temp;
    for(int i=0;i<s1.length();i++) {
    	temp = s1.charAt(i)-65;
    	arr[temp] = 1;
    }
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]!=1) {
    		System.out.println("Not pangram");
    		System.exit(0);
    	}
    }
    System.out.println("Pangram");
}
}
