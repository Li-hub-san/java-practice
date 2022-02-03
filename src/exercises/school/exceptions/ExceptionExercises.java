package exercises.school.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {
//        division(10, 0);
//        division(10, null);
//
        nullString(null);
        nullString("Ligia");
//
//        tryWhile();
    }


    private static void division(int numberOne, Integer numberTwo) {
        try {
            System.out.println(numberOne / numberTwo);
        } catch (ArithmeticException exception) {
            System.out.println("You cannot divide by 0, " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Segunda exceção: " + exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
    }

    private static void nullString(String name) {
        try {
            System.out.println(name.substring(0, 6));
        } catch (NullPointerException exception) {
            System.out.println("You string is null. " + exception.getMessage());
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(name.length() + " is smaller than the length you are going for. " + exception.getMessage());
        }
    }

    private static void tryWhile() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;

        while (!isCorrect) {
            try {
                System.out.println("Input a number: ");
                int number = scanner.nextInt();

                if (number <= 10) {
                    throw new MissingNumberException();
                }

                isCorrect = true;
            } catch (MissingNumberException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}
