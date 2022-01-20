package exercises.school.aula13;

public class Main {

  public static void main(String[] args) {
    Company company = new Company();

    company.addDivision(new Division(DivisionType.OFFICE, 20, 2, 5));
    company.addDivision(new Division(DivisionType.KITCHEN, 50, 3, 20));
    company.addDivision(new Division(DivisionType.WC, 5, 0, 0));

    System.out.println(company.getDivisions());

    // Posso instanciar o trabalhador para a variavel e adicionar a variavel à lista
    // através do método addEmployee(first) com a variavel dentro.
    Employee first = new Employee("Jessica", "Barros", 25, 960.20);
    company.addEmployee(first);

    // Ou posso chamar a instância da companhia.metodo(e dentro fazer novo
    // trabalhador e instancia-lo sem o colocar numa variável)
    company.addEmployee(new Employee("Jessica", "Barros", 25, 960.20));
    company.addEmployee(new Employee("Lígia", "Santos", 35, 550.10));
    company.addEmployee(new Employee("Leticia", "Barbosa", 39, 1500));
    company.addEmployee(new Employee("Diogo", "Barros", 27, 820.50));

    // for aperfeiçoado.
    for (Employee employee : company.getEmployees()) {
      System.out.println("Enhanced for -> employee.getName: " + employee.getName());
    }

    // forEach
    System.out.println("***** All employee names *****");
    company.getEmployees()
        .forEach(employee -> System.out.println("forEach employee -> employee.getName: " + employee.getName()));
    System.out.println("***** All company Divisions *****");
    System.out.println("Number of divisions: " + company.getNumberOfDivisions());
    company.getDivisions().forEach(division -> System.out
        .println("forEach division -> division.getDivisionType: " + division.getDivisionType()));

//
//    for (int i = 0; i < company.getNumberOfEmployees(); i++) {
//      System.out.println("current employee " + company.getEmployees().get(i));
//    }

//    System.out.println(company.getEmployees().size());
//    System.out.println(company.getEmployees());
//    company.payEmployees();
//    System.out.println(company.getEmployees());
//    System.out.println("Capital after payment: " + company.getCompanyCapital());
  }

}
