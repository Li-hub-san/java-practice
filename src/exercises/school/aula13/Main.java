package exercises.school.aula13;

public class Main {

  public static void main(String[] args) {
    Company testCompany = new Company();

    testCompany.addDivision(new Division(DivisionType.OFFICE, 20, 2, 5));
    testCompany.addDivision(new Division(DivisionType.KITCHEN, 50, 3, 20));
    testCompany.addDivision(new Division(DivisionType.WC, 5, 0, 0));

    testCompany.addEmployee(new Employee("Jessica", "Barros", 25, 960.20));
    testCompany.addEmployee(new Employee("Lígia", "Santos", 35, 550.10));
    testCompany.addEmployee(new Employee("Leticia", "Barbosa", 39, 1500));
    testCompany.addEmployee(new Employee("Diogo", "Barros", 27, 820.50));

    System.out.println(testCompany.employees.size());
  }

}
