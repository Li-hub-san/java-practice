package exercises.home.ana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises {
  private final Scanner sc = new Scanner(System.in);

  public void exercise1And2() {
    int numberOfFriends = requestNumberOfFriends();
    List<Friend> friends = requestFriends(numberOfFriends);
    Friend oldest = getOldestFriend(friends);
    Friend youngest = getYoungestFriend(friends);
    System.out.println();
    System.out.println("Oldest friend: " + oldest);
    System.out.println("Youngest friend: " + youngest);
  }

  private int requestNumberOfFriends() {
    System.out.print("Input how many close friends you've got: ");
    return sc.nextInt();
  }

  private String requestFriendName(int friendIndex) {
    System.out.print("Input friend " + (friendIndex + 1) + " name: ");
    String name = sc.next();
    return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
  }

  private int requestFriendAge(String name) {
    System.out.print("How old is " + name + "? ");
    return sc.nextInt();
  }

  private int requestMonthOfBirth(String name) {
    System.out.print("Input " + name + "'s birth month number: ");
    return sc.nextInt();
  }

  private List<Friend> requestFriends(int numberOfFriends) {
    List<Friend> friends = new ArrayList<>();

    for (int i = 0; i < numberOfFriends; i++) {
      String name = requestFriendName(i);
      int age = requestFriendAge(name);
      int month = requestMonthOfBirth(name);

      Friend friend = new Friend(name, age, month);
      friends.add(friend);
    }

    return friends;
  }

  private Friend getOldestFriend(List<Friend> friends) {
    return friends.stream()
        .reduce(friends.get(0), (friend, friend2) -> {
          if (friend.getAge() == friend2.getAge()) {
            return friend.getMonth() < friend2.getMonth() ? friend : friend2;
          }
          return friend.getAge() > friend2.getAge() ? friend : friend2;
        });
  }

  private Friend getYoungestFriend(List<Friend> friends) {
    return friends.stream()
        .reduce(friends.get(0), (friend, friend2) -> {
          if (friend.getAge() == friend2.getAge()) {
            return friend.getMonth() > friend2.getMonth() ? friend : friend2;
          }
          return friend.getAge() < friend2.getAge() ? friend : friend2;
        });
  }

}
