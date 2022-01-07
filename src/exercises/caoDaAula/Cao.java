package exercises.caoDaAula;

public class Cao extends Animal {
    private String breed;

    public Cao(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
//        setName(name);
    }

    public String communicate() {
        return super.communicate() + "au au au";
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
