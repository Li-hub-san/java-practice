package exercises.school.aula13;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Division> divisions = new ArrayList<>();
    Division division1 = new Division(DivisionType.OFFICE, 20, 2, 5);
    Division division2 = new Division(DivisionType.KITCHEN, 50, 3, 20);
    Division division3 = new Division(DivisionType.WC, 5, 0, 0);
    divisions.add(division1);
    divisions.add(division2);
    divisions.add(division3);

    Company company = new Company(1_000_000d,"Super São Roque","Funchal", 123456789, divisions);

    Employee employee1 = new Employee("Jessica", "Barros", 27, 2.500, EmployeeType.CEO);
    Employee employee2 = new Employee("Lígia", "Santos", 36, 1.500, EmployeeType.ACCOUNTANT);
    Employee employee3 = new Employee("Leticia", "Barbosa", 27, 2.500, EmployeeType.CFO);
    Employee employee4 = new Employee("Diogo", "Barros", 27, 980.25, EmployeeType.SALES_PERSON);
    company.addEmployee(employee1);
    company.addEmployee(employee2);
    company.addEmployee(employee3);
    company.addEmployee(employee4);

    for(Employee employee: company.getEmployees()) {
      employee.work();
    }

    company.getEmployees().forEach(employee -> {
      System.out.println("My name is " + employee.getName() + " and my job position at " + company.getName() + " is " + employee.getJobPosition());
    });
    System.out.println("Its pay day!!!");
    company.payEmployees();
    company.getEmployees().forEach(employee -> System.out.println(employee.getWallet()));
    System.out.println("Company capital after payment: "+ company.getCompanyCapital());

    System.out.println(division1.getDivisionType() +","+ division1.getNumberOfSeatedSpots());
    System.out.println(company.getCompanySeatedSpots());
  }

}
