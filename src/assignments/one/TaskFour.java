package assignments.one;

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer 'a' and 'b'  values");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int temp;
	  
      temp=a;
      a=b;
      b=temp;
      System.out.println("After swappping a="+a +" b="+b);
	}

}
