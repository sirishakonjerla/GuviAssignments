package assignments.four;
import java.util.Scanner;

public class DivisionHandler {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter number one");
	int num1 = scanner.nextInt();
	System.out.println("enter number two");
	int num2 =scanner.nextInt();
	
	try {
		divisionOfTwoNumbers(num1, num2);
	} catch (ArithmeticException e) {
		System.out.println("Please check that num2 cant be zero");
	} catch (Exception e) {
		System.out.println("Something went wrong, please check your inputs");
	}
}

public static void divisionOfTwoNumbers(int num1, int num2)
		throws ArithmeticException {
	int division = num1 / num2;
	System.out.println("division is :: " + division);
}
}
