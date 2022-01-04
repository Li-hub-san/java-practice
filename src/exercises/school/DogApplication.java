package exercises.school;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DogApplication {
    public static void main(String[] args) {
        Dog steve = new Dog("Steve", 5, "german shepherd", 13.1);
        Dog bob = new Dog("Bob", 3, "american bulldog", 7);
        Dog milo = new Dog("Milo", 10, "airedale terrier", 8.5);
        Dog kobe = new Dog("Kobe", 8, "american staffordshire terrier", 9.2);
        Dog boomer = new Dog("Boomer", 7, "golden retriever", 13.1);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(steve);
        dogList.add(bob);
        dogList.add(milo);
        dogList.add(kobe);
        dogList.add(boomer);

        System.out.println(dogList);
        System.out.println("Average weight: " + getAverageWeight(dogList));

    }

    public static double getAverageWeight(List<Dog> dogList) {
        double weightSum = dogList.stream().map(Dog::getWeight).reduce(0d, (a, b) -> a + b);
        return weightSum / dogList.size();
    }

}
