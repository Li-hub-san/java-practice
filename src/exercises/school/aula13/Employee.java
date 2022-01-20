package exercises.school.aula13;

public class Employee implements EmployeeInterface {
  private String name;
  private String surName;
  private int age;
  private double salary;
  private double wallet;
  private EmployeeType jobPosition;

  public Employee(String name, String surName, int age, double salary, EmployeeType position) {
    this.name = name;
    this.surName = surName;
    this.age = age;
    this.salary = salary;
    this.jobPosition = position;
    this.wallet = 0;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", surName='" + surName + '\'' +
        ", age=" + age +
        ", salary=" + salary +
        ", wallet=" + wallet +
        '}';
  }

  @Override
  public void work() {
    System.out.println("I, " + name + ", am working");
  }

  @Override
  public void receiveSalary() {
    wallet += this.salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public double getWallet() {
    return wallet;
  }

  public EmployeeType getJobPosition() {
    return jobPosition;
  }

}
