package assignments.two;

import java.util.Scanner;

public class StudentGrading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scanner.nextInt();
		if (marks == 100) {
			System.out.println("your grading is S");

		} else if (marks >= 90 && marks <= 99) {
			System.out.println("your grading is A");
		} else if (marks >= 80 && marks <= 89) {
			System.out.println("your grading is B");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println(" your grading is C");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("your grading is D");
		} else if (marks >= 50 && marks <= 59) {
			System.out.println("your grading is E");
		} else if (marks <= 50) {
			System.out.println("your grading is F");
		} else if (marks >= 100) {
			System.out.println("Invalid input");

		}
	}

}
