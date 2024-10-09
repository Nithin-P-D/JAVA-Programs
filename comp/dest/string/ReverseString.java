package comp.dest.string;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str = sc.nextLine();
	int spc = 0;
	for(int i = 0;i<str.length();i++) {
		if(str.charAt(i)==' ' ) {
			spc++;
		}
	}
	int wd_cnt=spc+1;
	
	String arr[] = new String[wd_cnt];
	int temp = arr.length-1;
	
	String temp_string="";
	for(int i = str.length()-1;i>=0;i--) {
		if(str.charAt(i) != ' ') {
			temp_string = temp_string + str.charAt(i);
		}
		else {
			arr[temp] = temp_string;
			temp--;
			temp_string="";
		}
	}
	arr[temp] = temp_string;
	for(int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
