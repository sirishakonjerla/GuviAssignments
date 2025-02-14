package assignments.two;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String a = scanner.next();
		String rev="";
		int len=a.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev + a.charAt(i);
		}
			
	
     System.out.println("string reverse "+rev);
	}
	}
