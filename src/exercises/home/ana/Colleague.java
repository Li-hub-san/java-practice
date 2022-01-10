package exercises.home.ana;

public class Colleague {
  private int age;

  public Colleague(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Colleague{" +
        "age=" + age +
        '}';
  }
}
