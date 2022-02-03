package exercises.cao_da_aula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        Dog kobe = new Dog("Kobe", 7, 15.2, "german shepherd");
        Dog boomer = new Dog("Boomer", 9, 30, "golden retriever");
        dogs.add(kobe);
        dogs.add(boomer);

        Cat luna = new Cat("Luna", 3, 2, true);
        Cat loki = new Cat("Loki", 5, 2.5, false);
        cats.add(luna);
        cats.add(loki);

        animals.add(kobe);
        animals.add(boomer);
        animals.add(luna);
        animals.add(loki);

        System.out.println(dogs);
        System.out.println(cats);
        System.out.println("---- dogs ----");
        printDogsBarking(dogs);
        System.out.println("---- cats ----");
        printCatsMeowing(cats);
        System.out.println("---- animals ----");
        System.out.println(animals);
        printAnimalsCommunicating(animals);
    }

    public static void printDogsBarking(List<Dog> dogs) {
        for (Dog currentDog : dogs) {
            System.out.println(currentDog.communicate());
        }
    }

    public static void printCatsMeowing(List<Cat> cats) {
        for (Cat currentCat : cats) {
            System.out.println(currentCat.communicate());
        }
    }

    public static void printAnimalsCommunicating(List<Animal> animals) {
        for (Animal currentAnimal : animals) {
            System.out.println(currentAnimal.communicate());
            if (currentAnimal instanceof Cat) {
                System.out.println(" and regarding hunting: " + ((Cat) currentAnimal).isHunter());
            }
        }
    }

}
