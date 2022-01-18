package exercises.school.aula13;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
  int companyCapital = 1000000000;

  List<Employee> employees = new ArrayList<>();
  List<Division> divisions = new ArrayList<>();

  public void addDivision(Division division) {
    divisions.add(division);
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  @Override
  public void payEmployees() {
//    employees.forEach(Employee::receiveSalary);
  }

  @Override
  public void chargeCostumers() {
  }

  @Override
  public int getNumberOfEmployees() {
    return 0;
  }

  @Override
  public int getNumberOfSeatedPlaces() {
    return 0;
  }

}
