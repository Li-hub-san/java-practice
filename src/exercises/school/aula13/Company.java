package exercises.school.aula13;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
  private double companyCapital = 1_000_000d;

  private final List<Employee> employees = new ArrayList<>();
  private final List<Division> divisions = new ArrayList<>();

  public List<Employee> getEmployees() {
    return employees;
  }

  public List<Division> getDivisions() {
    return divisions;
  }

  public void addDivision(Division division) {
    divisions.add(division);
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  @Override
  public void payEmployees() {
    for (Employee employee : employees) {
      companyCapital -= employee.getSalary();
      employee.receiveSalary();
    }
  }

  @Override
  public void chargeCostumers() {
  }

  @Override
  public int getNumberOfEmployees() {
    return employees.size();
  }

  public int getNumberOfDivisions() {
    return divisions.size();
  }

  @Override
  public int getNumberOfSeatedPlaces() {
    return 0;
  }

  public double getCompanyCapital() {
    return companyCapital;
  }
}
