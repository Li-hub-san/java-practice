package exercises;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
        System.out.print("Input a number: ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int random = generateRandomNumber(input);
        System.out.println("Random number between 0 and " + input + ": " + random);
    }

    public static int generateRandomNumber(int aNumber) {
        int min = 0;
        int range = aNumber - min + 1;

        return (int) Math.round(Math.random() * range + min);
    }
}
