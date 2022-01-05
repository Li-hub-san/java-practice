package exercises.home.ana;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exercises {

  public void someExercise() {
    Scanner scanner = new Scanner(System.in);
    String noMoreFriends = "exit";
    List<String> namesList = new ArrayList<>();

    System.out.print("Write a name of a friend: ");
    String friendName = scanner.next();

    do {
      namesList.add(friendName.substring(0, 1).toUpperCase() + friendName.substring(1).toLowerCase());
      System.out.print("Write a name of a friend or write exit if you don't want to insert more names: ");
      friendName = scanner.next();
    } while (!Objects.equals(friendName.toLowerCase(), noMoreFriends));

    System.out.println(namesList);
  }

}
