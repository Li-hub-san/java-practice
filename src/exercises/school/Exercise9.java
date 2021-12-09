package exercises.school;

public class Exercise9 {

	public static void main(String[] args) {
		int minNumber = 1;
		int maxNumber = 30;

		int sumOdds = 0;
		long multiplyEven = 1;

		for (int i = minNumber; i <= maxNumber; i++) {
			if (i % 2 != 0) {
				sumOdds += i;
			} else {
				multiplyEven *= i;
			}
		}

		System.out.println("The sum of all odd numbers between " + minNumber + " and " + maxNumber + " is: " + sumOdds
				+ "\n" + "The multiplication even numbers between " + minNumber + " and " + maxNumber + " is: "
				+ multiplyEven);
	}
}
