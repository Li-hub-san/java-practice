package exercises.school;

import exercises.school.aula13.missingNumberException;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
//        division(10, 5);
//        division(10, 0);

//        nullString("Ligia");
//        nullString(null);
//
        tryWhile();
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();

//        if (number < 10) {
//            throw new missingNumberException();
//        }
    }


    private static void division(int numberOne, int numberTwo) {

        try {
            System.out.println(numberOne / numberTwo);
        } catch (ArithmeticException exception) {
            System.out.println("You cannot divide by 0, " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Segunda exceção" + exception.getMessage());
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
        System.out.println("Input a number: ");

        boolean correct = false;

        while (!correct) {
            try {

                correct = true;
            } catch (StringIndexOutOfBoundsException exception) {
                scanner.nextInt();
                System.out.println("Input a number: ");
            }
        }
    }


}
