package exercises.home.dog;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    Dog kobe = new Dog("Kobe", 5, "german shepherd", 32.5);
    Dog butch = new Dog("Butch", 3, "american bulldog", 35);
    Dog milo = new Dog("Milo", 10, "airedale terrier", 25);
    Dog buster = new Dog("Buster", 8, "chihuahua", 2.1);
    Dog boomer = new Dog("Boomer", 7, "golden retriever", 31);

    List<Dog> dogList = new ArrayList<>();
    dogList.add(kobe);
    dogList.add(butch);
    dogList.add(milo);
    dogList.add(buster);
    dogList.add(boomer);

    Dog heaviestDog = getHeaviestDog(dogList);
    Dog lightestDog = getLightestDog(dogList);

    System.out.println("\n" + "----------------- Exercise 9 -----------------");
    System.out.println("Average dog weight: " + getAverageWeight(dogList) + "kg");
    System.out.println("Heaviest dog: " + heaviestDog.getName() + ", " + heaviestDog.getWeight() + "kg");
    System.out.println("Lightest dog: " + lightestDog);

    System.out.println("\n" + "----------------- Exercise 9.1 ---------------");
    printDogsBarking(dogList);

    System.out.println("\n" + "----------------- Exercise 9.2 ---------------");
    printDogYearsInHumanYears(dogList);
  }

  public static double getAverageWeight(List<Dog> dogList) {
    double weightSum = dogList.stream()
        .map(Dog::getWeight)
        .reduce(0d, Double::sum);
    return Math.round(weightSum / dogList.size() * 100) * 0.01;
  }

  public static Dog getHeaviestDog(List<Dog> dogList) {
    Dog heaviestDog = dogList.get(0);

    for (int i = 1; i < dogList.size(); i++) {
      Dog currentDog = dogList.get(i);

      if (currentDog.getWeight() > heaviestDog.getWeight()) {
        heaviestDog = currentDog;
      }
    }

    return heaviestDog;
  }

  public static Dog getHeaviestDog2(List<Dog> dogList) {
    return dogList.stream()
        .reduce(dogList.get(0), (a, b) -> a.getWeight() > b.getWeight() ? a : b);
  }

  public static Dog getLightestDog(List<Dog> dogList) {
    Dog lightestDog = dogList.get(0);

    for (int i = 1; i < dogList.size(); i++) {
      Dog currentDog = dogList.get(i);

      if (currentDog.getWeight() < lightestDog.getWeight()) {
        lightestDog = currentDog;
      }
    }

    return lightestDog;
  }

  public static Dog getLightestDog2(List<Dog> dogList) {
    return dogList.stream()
        .reduce(dogList.get(0), (a, b) -> a.getWeight() < b.getWeight() ? a : b);
  }


  public static void printDogsBarking(List<Dog> dogList) {
    for (Dog currentDog : dogList) {
      System.out.println(currentDog.bark());
    }
  }

  public static void printDogYearsInHumanYears(List<Dog> dogList) {
    for (Dog currentDog : dogList) {
      System.out.println(currentDog.dogYearsToHumanYears());
    }
  }

}
