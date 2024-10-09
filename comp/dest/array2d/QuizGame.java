package comp.dest.array2d;

import java.util.Scanner;

public class QuizGame {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int score = 0;
	
	System.out.println("Question1: Which is the longest river ib India?");
	System.out.println("1.Brahmaputra");
	System.out.println("2.Ganga");
	System.out.println("3.Kaveri");
	System.out.println("4.Yamuna");
	
	System.out.print("Enter the choice: ");
	int choice = sc.nextInt();
	switch(choice) {
	case 1 :
		System.out.println("Incorrect option ");
		break;
	case 2 :
		System.out.println("Correct option");
		break;
	case 3 :
		System.out.println("Incorrect option");
		break;
	case 4 :
		System.out.println("Incorrect option");
		break;
		default:
			System.out.println("Invalid option entered");
	}
	score++;
}
}
