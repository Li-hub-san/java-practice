package exercises.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChristmasJavaExercises {
    Scanner scanner = new Scanner(System.in);

    /**
     * Exercise 1. Asks for a paycheck (number) and prints it with a discount percentage.
     *
     * @param percentage of your choice
     */
    public void exercise1PrintPayCheckMinusPercentage(double percentage) {
        percentage /= 100;

        System.out.print("How much do you earn? ");
        double payCheckMinusPercentage = scanner.nextDouble() * (1 - percentage);

        System.out.printf("You paycheck minus %f%% is: %f", roundNumber(percentage * 100, 0), payCheckMinusPercentage);
    }

    /**
     * Exercise 2. Asks for a number and prints the number before and the number after.
     */
    public void exercise2PrintBeforeAndAfterNumber() {
        System.out.print("Input a number: ");
        int userInputNumber = scanner.nextInt();

        int beforeNumber = userInputNumber - 1;
        int afterNumber = userInputNumber + 1;

        System.out.print("Follows " + beforeNumber + "\n" + "Precedes " + afterNumber);
    }

    /**
     * Exercise 3. Prints student's name, average grade and the information if they passed or failed the course.
     */
    public void exercise3PrintGradeMessageToStudent() {
        String studentName = requestName();
        List<Double> grades = requestStudentGrades();

        double averageGrade = calculateAverageGrade(grades);

        System.out.print(studentName + ", you " + validateGrade(averageGrade) + " with an average grade of " + roundNumber(averageGrade, 1) + " values.");
    }

    /**
     * Asks the student their name.
     *
     * @return name.
     */
    public String requestName() {
        System.out.print("Input your first name? ");
        return scanner.next();
    }

    /**
     * Asks the student their three grades of a course.
     *
     * @return ArrayList with the grades.
     */
    public List<Double> requestStudentGrades() {
        System.out.print("Input your three grades of a course in order to know if you passed the course and your average score: ");

        List<Double> gradeList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            double grade = scanner.nextDouble();
            if (grade <= 20 && grade >= 0) {
                gradeList.add(grade);
            } else {
                System.out.println(grade + " is an invalid grade. Input a value between 0 and 20.");
                i--;
            }
        }

        return gradeList;
    }

    /**
     * Receives a list of grades and returns the average.
     *
     * @param gradeList ArrayList of the grades.
     * @return average grade.
     */
    public double calculateAverageGrade(List<Double> gradeList) {
        double gradeSum = 0;

        for (double grade : gradeList) {
            gradeSum += grade;
        }

        return gradeSum / gradeList.size();
    }

    /**
     * Receives an average grade and verifies if the student passed or failed the course.
     *
     * @param averageGrade average grade.
     * @return String: failed or passed.
     */
    public String validateGrade(double averageGrade) {
        return averageGrade >= 10 ? "passed" : "failed";
    }

    /**
     * Receives a double and an int, and returns the rounded double to the number of houses of the int.
     *
     * @param value  double
     * @param places int
     * @return double rounded to the decimal count of the int.
     */
    public static double roundNumber(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**
     * Exercise 4. Asks for a number and prints weather it is present in an interval.
     */
    public void exercise4AskUserForNumberAndReturnMessage() {
        System.out.print("Input a number: ");
        int userNumber = scanner.nextInt();

        System.out.println(verifyNumberInterval(userNumber));
    }

    /**
     * Receives an int, verifies if it is present in a determined interval, and returns a String validating the previous.
     *
     * @param userNumber int
     * @return String: Is/Is Not on the interval.
     */
    public String verifyNumberInterval(int userNumber) {
        if (userNumber >= 50 && userNumber <= 100) {
            return "Your number is within the required interval.";
        }
        return "Out of interval.";
    }

    /**
     *
     */
    public void exercise5AskFullNameAndPresentFirstAndLast() {
        System.out.print("Input your full name: ");
        String fullName = scanner.nextLine();

        List<String> nameList = convertFullNameToNameList(fullName);
        System.out.println(getFistAndLastNames(nameList));
    }

    /**
     * @param fullName
     * @return
     */
    public List<String> convertFullNameToNameList(String fullName) {
        return List.of(fullName.split(" "));
    }

    /**
     * @param nameList
     * @return
     */
    public String getFistAndLastNames(List<String> nameList) {
        return nameList.get(0) + " " + nameList.get(nameList.size() - 1);
    }

    /**
     *
     */
    public void exercise6AskNamePrintLengthOddOrEven() {
        System.out.println(isNameLengthOddOrEven(requestName()));
    }

    /**
     * @param name
     * @return
     */
    public String isNameLengthOddOrEven(String name) {
        String output = "odd";

        if (name.length() % 2 == 0) {
            output = "even";
        }
        return "Your name length is " + output + "!";
    }

    /**
     *
     */
    public void exercise7AskNamePrintReversedName() {
        System.out.println(reverseName(requestName()));
    }

    /**
     * Receives a name and returns the name reversed.
     *
     * @param name String.
     * @return reversed String.
     */
    public String reverseName(String name) {
        String message = "Your reversed name: ";
        return message + new StringBuilder(name).reverse();
    }

    /**
     * Exercise 8. Asks for a temperature in celsius and prints the temperature in fahrenheit.
     */
    public void exercise8() {
        System.out.print("Input a temperature in Celsius so I can convert it to Fahrenheit: ");
        int temperatureInCelsius = scanner.nextInt();

        System.out.println(convertCelsiusToFahrenheit(temperatureInCelsius));
    }

    /**
     * Receives a temperature in celsius and converts to fahrenheit.
     *
     * @param celsius int: temperature in celsius.
     * @return int: temperature in fahrenheit.
     */
    public String convertCelsiusToFahrenheit(int celsius) {
        int fahrenheit = (9 * celsius + 160) / 5;

        return fahrenheit + "°F";
    }

}
