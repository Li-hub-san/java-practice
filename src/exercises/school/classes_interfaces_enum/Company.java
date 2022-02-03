package exercises.school.classes_interfaces_enum;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
    private double companyCapital;
    private String name;
    private String address;
    private int fiscalNumber;
    private List<Division> divisions;

    private List<Employee> employees;

    public Company(double companyCapital, String name, String address, int fiscalNumber, List<Division> divisions) {
        this.name = name;
        this.address = address;
        this.companyCapital = companyCapital;
        this.fiscalNumber = fiscalNumber;
        this.divisions = divisions;

        employees = new ArrayList<>();
    }

    //recebe nos parametros a empresa na qual quero enviar os trabalhadores e o trabalhador que quero enviar.
    //verifico se o trabalhador percente à lista da qual estou a remover e depois adiciono à companhia e removo-o da lista.
    public void lendEmployee(Company company, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) == employee) {
                company.addEmployees(employee);
                employees.remove(employee);
            }
        }
    }

    public void fireEmployees() {
        employees.clear();
    }


    public int getCompanySeatedSpots() {
        int totalSeats = 0;
        for (Division division : divisions) {
            int eachDivisionSpots = division.getNumberOfSeatedSpots();
            totalSeats = totalSeats + eachDivisionSpots;
        }

        return totalSeats;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    // Faço primeiro as verificações e return para saír da função.
    @Override
    public void payEmployees(Manager manager) {
        if (!manager.allowsPayment()) {
            System.out.println("Paycheck not approved by the manager.");
            return;
        }

        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary();
        }

        if (totalSalaries > companyCapital) {
            System.out.println("Not enough capital for paychecks");
            return;
        }

        for (Employee employee : employees) {
            employee.receiveSalary();
            companyCapital -= employee.getSalary();
        }

        System.out.println("Payments have been made.");
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
