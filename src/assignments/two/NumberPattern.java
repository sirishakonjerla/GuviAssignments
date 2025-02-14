package assignments.two;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scanner.nextInt();
		int number=0;
		for(int i=1;i<=a;i++) {
	    for(int j=1;j<=i;j++) {
	    	number=number+1;
	    	System.out.print(number +"  " );
	    }
	    System.out.println();
		}
		
		

	}

}
