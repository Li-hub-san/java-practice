package exercises.school;

import java.util.Scanner;

public class Exercise8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input A number: ");
    int numberA = sc.nextInt();

    System.out.print("Input B number: ");
    int numberB = sc.nextInt();

    int swap = numberA;
    numberA = numberB;
    numberB = swap;

    System.out.println("Number A = " + numberA + "\n" + "Number B = " + numberB);
    sc.close();
  }
}
