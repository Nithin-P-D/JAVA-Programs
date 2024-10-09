package comp.dest.string;

import java.util.Scanner;
class VowelsOperation{
	
	void countVowelsConsonants(String s) {
		int vowel_count = 0;
		int consonant_count = 0;
		System.out.println("Counting the vowels and consonant count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||
					s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ) {
				vowel_count++;
			}
			else {
				consonant_count++;
				
			}
		}
		System.out.println("The vowels count is = "+vowel_count);
		System.out.println("The consonant count is = "+consonant_count);
		System.out.println("=============================");
	}
	void lowerCaseVowels(String s) {
		int lower_vowel_count = 0;
		
		System.out.println("Counting the lower case vowels ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'  ) {
				lower_vowel_count++;
			}
			
		}
		System.out.println("The vowels count is = "+lower_vowel_count);
		System.out.println("=============================");
	}
	void upperCaseVowels(String s) {
		int upper_vowel_count = 0;
		
		System.out.println("Counting the upper case vowels ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'   ) {
				upper_vowel_count++;
			}
			
		}
		System.out.println("The vowels count is = "+upper_vowel_count);
		System.out.println("=============================");
	}
	void replaceVowels(String s) {
		String str_temp="";
		System.out.println("Replacing the vowels with special character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||
					s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ) {
				str_temp = str_temp + '@';
			}
			else {
				str_temp = str_temp + s.charAt(i);
				
			}
		}
		System.out.println("The replaced string  is = "+str_temp);
		
		System.out.println("=============================");
	}
	void replaceLowerCaseVowels(String s) {
		String str_temp="";
		System.out.println("Replacing the lower case vowels with special character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') {
				str_temp = str_temp + '@';
			}
			else {
				str_temp = str_temp + s.charAt(i);
				
			}
		}
		System.out.println("The replaced string  is = "+str_temp);
		
		System.out.println("=============================");
	}
	void replaceUpperCaseVowels(String s) {
		String str_temp="";
		System.out.println("Replacing the upper case vowels with special character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ) {
				str_temp = str_temp + '@';
			}
			else {
				str_temp = str_temp + s.charAt(i);
				
			}
		}
		System.out.println("The replaced string  is = "+str_temp);
		
		System.out.println("=============================");
	}
	void indivitualVowels(String s) {
		String str_temp="";
		System.out.println("Replacing the indivitual vowels with special character:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A') {
				str_temp = str_temp+'@';
			}
			if(s.charAt(i)=='e' || s.charAt(i)=='E') {
				str_temp = str_temp+'#';
			}
			else if(s.charAt(i)=='i' || s.charAt(i)=='I') {
				str_temp = str_temp+'$';
			}
			else if(s.charAt(i)=='o' || s.charAt(i)=='O') {
				str_temp = str_temp+'&';
			}
			else if(s.charAt(i)=='u' || s.charAt(i)=='U') {
				str_temp = str_temp+'*';
			}
			else {
				str_temp = str_temp+ s.charAt(i);
			}
		}
	}
	

}
public class VowelsCode {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s = sc.nextLine();
	 VowelsOperation vo = new  VowelsOperation();
	 vo.countVowelsConsonants(s);
	 vo.lowerCaseVowels(s);
	 vo.upperCaseVowels(s);
	 vo.replaceVowels(s);
	 vo.replaceLowerCaseVowels(s);
	 vo.indivitualVowels(s);
	 
	 
	 
}
}
