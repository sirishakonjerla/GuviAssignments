package assignments.one;

public class TaskFive {

	public static void main(String[] args) {
		int number = 16;
		boolean isPrime = false;

		for (int i = 2; i < 13; i++) {
			if (number % i == 0) {
				isPrime = true;
				break;

			}
		}

		if (isPrime) {

			System.out.println("it's a prime number");

		} else {

			System.out.println("it's not a prime number");
		}
	}

}
