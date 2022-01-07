package exercises.home.ana;

import java.util.*;

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

  public String[] askHowManyFriendsAndTheirNames() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input how many close friends you've got: ");
    int numberOfFriends = sc.nextInt();

    String[] names = new String[numberOfFriends];

    for (int i = 0; i < numberOfFriends; i++) {
      System.out.println("Input friend " + (i + 1) + " name: ");
      String name = sc.next();
      names[i] = name;

      System.out.println("Array" + Arrays.toString(names));
    }

    return names;
  }

  public int[] askForFriendsAges() {}

}
