package exercises.school;

import java.util.Scanner;

public class Exercise7 {

  public static void main(String[] args) {
    System.out.print("Input your first name: ");

    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    String nameToUpperCase = nameToUpperCase(name);
    System.out.println("Name to uppercase: " + nameToUpperCase);

    String replaceOccurrence = replaceOccurrence(name);
    System.out.println("Replace letter i with number 1: " + replaceOccurrence);

    // what if the name is smaller than 3??? Create exception
    String printFirstThreeLetters = printFirstThreeLetters(name);
    System.out.println("First three letters: " + printFirstThreeLetters);

    sc.close();
  }

  public static String nameToUpperCase(String name) {
    return name.toUpperCase();
  }

  public static String replaceOccurrence(String name) {
    return name.replace("i", "1");
  }

  public static String printFirstThreeLetters(String name) {
    return name.substring(0, 3);
  }

}
