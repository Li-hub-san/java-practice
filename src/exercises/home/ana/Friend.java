package exercises.home.ana;

public class Friend {
  private final String name;
  private final int age;
  private int month;

  Friend(String name, int age, int month) {
    this.name = name;
    this.age = age;
    this.month = month;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Friend{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getMonth() {
    return month;
  }
}
