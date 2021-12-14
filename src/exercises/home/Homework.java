package exercises.home;

import java.util.Random;
import java.util.Scanner;

/**
 * <a href="https://www.w3resource.com/java-exercises/basic/index.php"> Java
 * Basic Programming : Exercises, Practice, Solution </a>
 */
public class Homework {

    /**
     * Write a Java program to print 'Hello' on screen and then print your name on a
     * separate line.
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * Hello
     * </p>
     * <p>
     * Alexandra Abramov
     * </p>
     */
    public void printHello() {
        System.out.println("Hello");
        System.out.println("L�gia Santos");
    }

    /**
     * Write a Java program to print the sum of two numbers.
     * <p>
     * Test Data:
     * </p>
     * <p>
     * 74 + 36
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 110
     * </p>
     */
    public void sumTwoNumbers() {
        System.out.println(74 + 36);
    }

    /**
     * Write a Java program to divide two numbers and print on the screen.
     * <p>
     * Test Data :
     * </p>
     * <p>
     * 50/3
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 16
     * </p>
     */
    public void divideTwoNumbersAndPrintToTheScreen() {
        System.out.println(50 / 3);
    }

    /**
     * <p>
     * Write a Java program to print the result of the following operations.
     * </p>
     * <p>
     * Test Data:
     * </p>
     * <p>
     * a. -5 + 8 * 6
     * </p>
     * <p>
     * b. (55+9) % 9
     * </p>
     * <p>
     * c. 20 + -3*5 / 8
     * </p>
     * <p>
     * d. 5 + 15 / 3 * 2 - 8 % 3
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 43
     * </p>
     * <p>
     * 1
     * </p>
     * <p>
     * 19
     * </p>
     * <p>
     * 13
     * </p>
     */
    public void resultOfPredefinedOperation() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    /**
     * <p>
     * Write a Java program that takes two numbers as input and display its product
     * </p>
     * <p>
     * Test Data:
     * </p>
     * <p>
     * Input first number: 25
     * </p>
     * <p>
     * Input second number: 5
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 25 x 5 = 125
     * </p>
     */
    public void inputNumbersAndDisplayItsProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int aFirstNumber = sc.nextInt();

        System.out.print("Input second number: ");
        int aSecondNumber = sc.nextInt();

        int product = aFirstNumber * aSecondNumber;
        System.out.println(aFirstNumber + " x " + aSecondNumber + " = " + product);

        sc.close();
    }

    /**
     * <p>
     * Write a Java program to print the sum, multiplication, subtraction, division
     * and remainder of two numbers.
     * </p>
     * <p>
     * Test Data:
     * </p>
     * <p>
     * Input first number: 125
     * </p>
     * <p>
     * Input second number: 24
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 125 + 24 = 149
     * </p>
     * <p>
     * 125 - 24 = 101
     * </p>
     * <p>
     * 125 x 24 = 3000
     * </p>
     * <p>
     * 125 / 24 = 5
     * </p>
     * <p>
     * 125 mod 24 = 5
     * </p>
     */
    public void printOperations() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int input1 = sc.nextInt();

        System.out.print("Input second number: ");
        int input2 = sc.nextInt();

        printOperation(input1, input2, "+", sum(input1, input2));
        printOperation(input1, input2, "-", subtraction(input1, input2));
        printOperation(input1, input2, "x", product(input1, input2));
        printOperation(input1, input2, "/", division(input1, input2));
        printOperation(input1, input2, "mod", remainder(input1, input2));

        sc.close();
    }

    private void printOperation(int aNumber1, int aNumber2, String aOperator, long aSum) {
        System.out.println(aNumber1 + " " + aOperator + " " + aNumber2 + " = " + aSum);
    }

    private long sum(int aNumber1, int aNumber2) {
        return aNumber1 + aNumber2;
    }

    public int subtraction(int aNumber1, int aNumber2) {
        return aNumber1 - aNumber2;
    }

    public long product(int aNumber1, int aNumber2) {
        return (long) aNumber1 * aNumber2;
    }

    public int division(int aNumber1, int aNumber2) {
        return (int) Math.round((double) aNumber1 / aNumber2);
    }

    public int remainder(int aNumber1, int aNumber2) {
        return Math.round(aNumber1 % aNumber2);
    }

    /**
     * <p>
     * Write a Java program that takes a number as input and prints its
     * multiplication table upto 10.
     * </p>
     * <p>
     * Test Data:
     * </p>
     * <p>
     * Input a number: 8
     * </p>
     * <p>
     * <b>Expected Output :</b>
     * </p>
     * <p>
     * 8 x 1 = 8
     * </p>
     * <p>
     * 8 x 2 = 16
     * </p>
     * <p>
     * 8 x 3 = 24
     * </p>
     * <p>
     * ...
     * </p>
     * <p>
     * 8 x 10 = 80
     * </p>
     */
    public void printMultiplicationTable() {
        System.out.print("Input a number: ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplication = input * i;
            System.out.println(input + " x " + i + " = " + multiplication);
        }

        sc.close();
    }

    public void createTriangle() {
        System.out.print("Input a number so I can print asteriscs: ");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();

        String outputString = "";
        System.out.println();

        for (int i = 0; i < userNumber; i++) {
            outputString += "* ";
            System.out.println(outputString);
        }
    }

    public void printAsterisk() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public void generateRandom() {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();

        Random random = new Random();
        int randomNumber = random.nextInt(userNumber + 1);
        System.out.println(randomNumber);
    }

    public void generateRandomWithRange() {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();

        int minRange = 2;

        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomWithRange(minRange, userNumber));
        }
    }

    public int generateRandomWithRange(int minRange, int maxRange) {
        Random random = new Random();
        return random.nextInt(maxRange - minRange + 1) + minRange;
    }

    public void printChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean iIsEven = i % 2 == 0;
                boolean jIsEven = j % 2 == 0;
                if ((iIsEven && !jIsEven) || (!iIsEven && jIsEven)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}
