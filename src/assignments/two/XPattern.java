package assignments.two;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}