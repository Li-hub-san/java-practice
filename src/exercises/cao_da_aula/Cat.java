package exercises.cao_da_aula;

public class Cat extends Animal {
    private boolean isHunter;

    public Cat(String name, int age, double weight, boolean isHunter) {
        super(name, age, weight);
        this.isHunter = isHunter;
//        setName(name);
    }

    public String communicate() {
        return super.communicate() + "meow meow, I am " + name;
    }

    public boolean isHunter() {
        return isHunter;
    }

    public void setHunter(boolean hunter) {
        isHunter = hunter;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isHunter=" + isHunter +
                '}';
    }
}
