package exercises;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your year of birth: ");
        int yearOfBirth = sc.nextInt();

        int age = calculateAgeFromBirthYear(yearOfBirth);
        System.out.println("You are " + age + " years old");

        sc.close();
    }

    public static int calculateAgeFromBirthYear(int aYearOfBirth) {
        return LocalDate.now().getYear() - aYearOfBirth;
    }

}
