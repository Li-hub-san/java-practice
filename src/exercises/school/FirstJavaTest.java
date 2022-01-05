package exercises.school;

import java.util.Scanner;

public class FirstJavaTest {

  public static void main(String[] args) {
    System.out.print("Input a number: ");
    Scanner sc = new Scanner(System.in);
    int firstInput = sc.nextInt();

    System.out.print("Input another number: ");
    int secondInput = sc.nextInt();

    int largestNumber = calculateLargestNumber(firstInput, secondInput);
    System.out.println("Largest number: " + largestNumber);

    if (largestNumber < 0) {
      int negativeNumbers = sumRunningTotalNegativeNumbers(largestNumber);
      System.out.println("Running total of " + largestNumber + " to 0 is: " + negativeNumbers);
    } else {
      int runningTotal = sumRunningTotal(largestNumber);
      System.out.println("Running total of 0 to " + largestNumber + " is: " + runningTotal);
    }

    sc.close();

  }

  public static int calculateLargestNumber(int number1, int number2) {
    int largestNumber = number1;

    if (number2 > number1) {
      largestNumber = number2;
    }

    return largestNumber;
  }

  public static int sumRunningTotal(int number) {
    int total = 0;

    for (int i = 0; i <= number; i++) {
      total += i;
    }

    return total;
  }

  public static int sumRunningTotalNegativeNumbers(int number) {
    int total = 0;

    for (int i = number; i < 0; i++) {
      total += i;
    }

    return total;
  }

}
