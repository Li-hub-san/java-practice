package exercises.home;

public class SimpleEmployee {
    private String name;
    private int age;

    public SimpleEmployee() {

    }

    public SimpleEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.name + " age: " + this.age;
    }
}
