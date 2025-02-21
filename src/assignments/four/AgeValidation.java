package assignments.four;

import java.util.Scanner;

class AgeValidation {

public static void main(String[] args)  {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the age");
	int age = scanner.nextInt();
	
	try {
		checkAge(age);
	} catch (InvalidAgeException e) {
		
		System.out.println(e.getMessage());
	}
}

public static void checkAge(int age) throws InvalidAgeException {
	
	if(age<18) {
		throw new InvalidAgeException("invalid age");
	}else {
		System.out.println("valid age");
	}
	
}

}