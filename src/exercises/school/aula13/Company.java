package exercises.school.aula13;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
    private double companyCapital;
    private String name;
    private String address;
    private int fiscalNumber;
    private List<Division> divisions;


//  public List<Employee> getEmployees() {
//    return employees;
//  }

    private List<Employee> employees;

    public Company(double companyCapital, String name, String address, int fiscalNumber, List<Division> divisions) {
        this.name = name;
        this.address = address;
        this.companyCapital = companyCapital;
        this.fiscalNumber = fiscalNumber;
        this.divisions = divisions;

        employees = new ArrayList<Employee>();
    }

    public int getCompanySeatedSpots() {
        int totalSeats = 0;
        for (Division division: divisions) {
            int eachDivisionSpots = division.getNumberOfSeatedSpots();
            totalSeats = totalSeats + eachDivisionSpots;
        }

        return totalSeats;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    @Override
    public void payEmployees() {
        double total = 0;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        if (total <= companyCapital) {
            for (Employee employee : employees) {
                employee.receiveSalary();
                companyCapital -= employee.getSalary();
            }
        } else {
            System.out.println("Not enough capital for paychecks");
        }
    }

    @Override
    public void chargeCostumers() {
    }

    @Override
    public int getNumberOfEmployees() {
        return employees.size();
    }

    @Override
    public int getNumberOfSeatedPlaces() {
        return 0;
    }

    public double getCompanyCapital() {
        return companyCapital;
    }

    public String getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}
