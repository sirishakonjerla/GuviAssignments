package assignments.two;


import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String a = scanner.next();

		String pal = "";
		int len = a.length();
		for (int i = len - 1; i >= 0; i--) {
			pal = pal + a.charAt(i);
		}

		if (a.equals(pal)) {
			System.out.println("It is a palindrome");

		} else {
			System.out.println("It is not a palindrome");
		}

	}

}

