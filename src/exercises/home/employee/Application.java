package exercises.home.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    Employee ana = new Employee("Ana", 700.00);
    Employee carolina = new Employee("Carolina", 32, 800.71);
    Employee bernardo = new Employee("Bernardo", 30, 900.50);
    Employee joana = new Employee("Joana", 50, 1030.20);
    Employee pedro = new Employee("Pedro", 40, 690.51);
    Employee jorge = new Employee("Jorge", 60, 1560.30);
    Employee diana = new Employee("Diana", 53, 980.25);

    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(ana);
    employeeList.add(carolina);
    employeeList.add(bernardo);
    employeeList.add(joana);
    employeeList.add(pedro);
    employeeList.add(jorge);
    employeeList.add(diana);

    ana.setAge(32);

    System.out.println("Employee list: " + employeeList);
    System.out.println("Sum of all salaries: " + getSalarySum(employeeList));
    System.out.println("Average salary: " + getSalaryAverage(employeeList));
    System.out.println("Highest salary using a for: " + getHighestSalary(employeeList));

    List<Double> salaries = employeeList.stream()
        .map(Employee::getSalary)
        .toList();
    System.out.println("Highest salary using Collections.max: " + Collections.max(salaries));

    System.out.println("Lowest salary using a for: " + getLowestSalary(employeeList));
    System.out.println("Names that end with 'a' : " + getEmployeesWhoseNamesEndWithLetterA(employeeList));
    System.out.println("Average salary for employees above 50: " + getAverageSalaryForEmployeesWithFiftyYearsHigher(employeeList));
  }

  public static double getSalarySum(List<Employee> employeeList) {
    return employeeList.stream()
        .map(Employee::getSalary)
        .reduce(0d, Double::sum);
  }

  public static double getHighestSalaryUsingReduceMax(List<Employee> employeeList) {
    return employeeList.stream()
        .map(Employee::getSalary)
        .reduce(Double::max)
        .orElse(0d);
  }

  public static double getSalaryAverage(List<Employee> employeeList) {
    return getSalarySum(employeeList) / employeeList.size();
  }

  public static double getHighestSalary(List<Employee> employeeList) {
    List<Double> salaryList = employeeList.stream()
        .map(Employee::getSalary)
        .toList();

    if (salaryList.size() == 0) {
      return 0;
    }

    double highestSalary = salaryList.get(0);
    for (double currentSalary : salaryList) {
      if (currentSalary > highestSalary) {
        highestSalary = currentSalary;
      }
    }
    return highestSalary;
  }

  public static double getLowestSalary(List<Employee> employeeList) {
    List<Double> salaryList = employeeList
        .stream()
        .map(Employee::getSalary)
        .toList();

    if (salaryList.size() == 0) {
      return 0;
    }

    double lowestSalary = salaryList.get(0);

    for (int i = 1; i < salaryList.size(); i++) {
      double currentSalary = salaryList.get(i);
      if (currentSalary < lowestSalary) {
        lowestSalary = currentSalary;
      }
    }

    return lowestSalary;
  }

  /**
   * Receives a list of employees and return the employees whose name ends with "a".
   *
   * @param employeeList list of employees.
   * @return list of employees whose names end with the letter "a".
   */
  public static List<Employee> getEmployeesWhoseNamesEndWithLetterA(List<Employee> employeeList) {
    return employeeList.stream()
        .filter(name -> name.getName().endsWith("a"))
        .toList();
  }

  public static double getAverageSalaryForEmployeesWithFiftyYearsHigher(List<Employee> employeeList) {
    List<Employee> employeesAbove50 = employeeList.stream()
        .filter(employee -> employee.getAge() >= 50)
        .toList();

    return getSalaryAverage(employeesAbove50);

  }

}
