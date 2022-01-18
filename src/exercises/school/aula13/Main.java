package exercises.school.aula13;

public class Main {

  public static void main(String[] args) {
    Company testCompany = new Company();

    testCompany.addDivision(new Division(DivisionType.OFFICE, 20, 2, 5));
    testCompany.addDivision(new Division(DivisionType.KITCHEN, 50, 3, 20));
    testCompany.addDivision(new Division(DivisionType.WC, 5, 0, 0));

    testCompany.addEmployee(new Employee());
    testCompany.addEmployee(new Employee());
    testCompany.addEmployee(new Employee());
    testCompany.addEmployee(new Employee());

    System.out.println(testCompany);
  }

}
