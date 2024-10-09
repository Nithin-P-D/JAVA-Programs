package comp.dest.variable;

import java.util.Scanner;

class Adhaar{
	String name;
	int adhaar_no;
	int age;
	String dob;
	static String country;
	
	static {
		country = "India";
	}
	public void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the adhaar_no:  ");
		adhaar_no = sc.nextInt();
		System.out.println("Enter the age:  ");
		age = sc.nextInt();
		System.out.println("Enter the dob :  ");
		dob = sc.next();
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(adhaar_no);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(country);
	}
}
public class StaticAdhaar {
public static void main(String[] args) {
	Adhaar a = new Adhaar();
	a.collectData();
	a.display();
}
}
