package exercises.home.dog;

public class Dog {
  private String name;
  private int age;
  private String breed;
  private double weight;

  public Dog(String name, int age, String breed, double weight) {
    this.name = name;
    this.age = age;
    this.breed = breed;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getBreed() {
    return breed;
  }

  public double getWeight() {
    return weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String bark() {
    return "Woof Woof Woof I am " + name;
  }

  public String dogYearsToHumanYears() {
    return name + ", " + age * 7 + " years old in human years.";
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", breed='" + breed + '\'' +
        ", weight=" + weight + "kg" +
        '}';
  }

}
