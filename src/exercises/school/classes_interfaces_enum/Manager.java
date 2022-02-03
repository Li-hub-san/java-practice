package exercises.school.classes_interfaces_enum;

public class Manager extends Employee {
    private boolean allowsPayment;

    public Manager(String name, String surName, int age, double salary) {
        super(name, surName, age, salary, EmployeeType.MANAGER);
        // Não é necessário. Por ser primitiva começa a falso.
        // this.allowsPayment = false;
    }

    public boolean allowsPayment() {
        return allowsPayment;
    }

    public void setAllowsPayment(boolean allowsPayment) {
        this.allowsPayment = allowsPayment;
    }
}
